package com.itheima.profile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @RequestMapping("/test")
    public String test(){
        return "test success ~";
    }
}
