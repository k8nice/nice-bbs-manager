package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 权限控制类
 * @author ningh
 */
@Controller
@RequestMapping(value = "/role",method = RequestMethod.GET)
public class RoleController {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        return "/shiro/role/list";
    }
}
