package com.shaw.myspringboot.service.impl;

import com.shaw.myspringboot.entity.TblUser;
import com.shaw.myspringboot.mapper.TblUserMapper;
import com.shaw.myspringboot.service.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TblUserServiceImpl implements TblUserService{

    @Autowired
    private TblUserMapper tblUserMapper;

    @Override
    public List<TblUser> getUserList() {
        return tblUserMapper.selectAll();
    }
}
