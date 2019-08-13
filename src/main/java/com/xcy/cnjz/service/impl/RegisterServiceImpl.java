package com.xcy.cnjz.service.impl;

import com.xcy.cnjz.mapper.RegisterMapper;
import com.xcy.cnjz.pojo.User;
import com.xcy.cnjz.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
    public void insertUser(User user) {
        registerMapper.registerUser(user);


    }
}
