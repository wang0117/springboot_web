package com.wch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wch.pojo.User;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月18日: 上午10:29:06
 */
@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    private User user;
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello,"+user.getUserName();
    }
    
}
