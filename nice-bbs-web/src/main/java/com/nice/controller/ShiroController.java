package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/shiro",method = RequestMethod.GET)
public class ShiroController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "/shiro/default";
    }
}
