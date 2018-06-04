package com.shaw.myspringboot.mapper;

import com.shaw.myspringboot.entity.TblUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TblUserMapper extends Mapper<TblUser>{
   List<TblUser> getUserList();
}
