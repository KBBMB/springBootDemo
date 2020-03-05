package com.it.dao;


import org.apache.ibatis.annotations.Mapper;

import com.it.pojo.User;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{

}
