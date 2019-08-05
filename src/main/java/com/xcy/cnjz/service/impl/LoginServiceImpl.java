package com.xcy.cnjz.service.impl;

import com.xcy.cnjz.mapper.LoginMapper;
import com.xcy.cnjz.pojo.User;
import com.xcy.cnjz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl  implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean login(User user) {
        int result = loginMapper.login(user);
           return result>0? true:false;
    }
}
