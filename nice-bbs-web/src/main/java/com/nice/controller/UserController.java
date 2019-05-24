package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户实体类
 * @author ningh
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    public String list(){
        return "/shiro/user/list";
    }
}
