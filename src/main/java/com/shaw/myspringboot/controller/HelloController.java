package com.shaw.myspringboot.controller;

import com.shaw.myspringboot.entity.TblUser;
import com.shaw.myspringboot.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TblUserService tblUserService;

    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    public List<TblUser> hello() {
        return tblUserService.getUserList();
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String world() {
        return "hello world";
    }
}
