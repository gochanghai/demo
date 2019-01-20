package com.gochanghai.leadservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @GetMapping("login")
    public String login(){
        System.out.println("login: " + new Date());
        return "123456" + "wwwww123456";
    }

}
