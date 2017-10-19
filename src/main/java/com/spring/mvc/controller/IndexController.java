package com.spring.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author guojunguang
 * @date 2017/10/12
 * @decription 首页相关Controller
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String goLogin(){
        return "/index/index";
    }
}
