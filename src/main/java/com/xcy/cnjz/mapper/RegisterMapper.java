package com.xcy.cnjz.mapper;

import com.xcy.cnjz.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {
    void registerUser(User user);
}
