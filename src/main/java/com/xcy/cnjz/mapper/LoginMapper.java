package com.xcy.cnjz.mapper;

import com.xcy.cnjz.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LoginMapper {
    int login(User user);
}
