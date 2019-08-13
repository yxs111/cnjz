package com.xcy.cnjz.controller;

import com.xcy.cnjz.pojo.User;
import com.xcy.cnjz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/user")
public class LoginController {
    @Autowired
    LoginService  loginService;
    @RequestMapping("/login")
    @ResponseBody
    public boolean login(User user){
        System.out.println(user);
        boolean result = loginService.login(user);
        if (result){
            System.out.println("login___true!!!");
            return  true;
        }else {
            System.out.println("login___false!!!");
            ; return  false;
        }

    }
}
