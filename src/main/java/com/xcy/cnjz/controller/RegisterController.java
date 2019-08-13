package com.xcy.cnjz.controller;

import com.xcy.cnjz.pojo.User;
import com.xcy.cnjz.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @RequestMapping("/register")
    @ResponseBody
    public String registerUser(User user){
        registerService.insertUser(user);
        System.out.println(user);
        return "success";


    }

}
