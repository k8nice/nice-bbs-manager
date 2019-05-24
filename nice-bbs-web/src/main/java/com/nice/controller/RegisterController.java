package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ningh
 */
@Controller
@RequestMapping(value = "/user/register",method = RequestMethod.GET)
public class RegisterController {
    @GetMapping( "/index")
    public String loginIndex(){
        return "register/index";
    }
}
