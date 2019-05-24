package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 菜单控制类
 * @author ningh
 */
@Controller
@RequestMapping(value = "/menu",method = RequestMethod.GET)
public class MenuController {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        return "shiro/menu/list";
    }

    @RequestMapping(value = "/list/add",method = RequestMethod.GET)
    public String addList(){
        return "shiro/menu/add";
    }
}
