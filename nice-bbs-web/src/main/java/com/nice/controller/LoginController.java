package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user/login",method = RequestMethod.GET)
public class LoginController {

    @GetMapping( "/index")
    public String loginIndex(){
        return "login/index";
    }
}
