package com.ignacio.mydongbao.application.portalweb.controller;

import com.ignacio.mydongbao.api.ums.IUserManageSystemRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h1>用户实体类 Controller</h1>
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 18:27
 */

@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @Autowired
    private IUserManageSystemRegisterService userManageSystemRegisterService;


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/register")
    public String register(){
        userManageSystemRegisterService.register();
        return "register";
    }

    public String test(){
        return "test";
    }
}
