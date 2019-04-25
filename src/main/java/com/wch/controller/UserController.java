package com.wch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wch.pojo.User;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月18日: 上午10:31:42
 */
@Controller
public class UserController {
    
    @Autowired
    private User user;
    
    @RequestMapping("/login")
    public String query(String userName,String password,Model model){
        if(userName.equals(user.getUserName()) && password.equals(user.getPassword())){
            model.addAttribute("msg", "用户"+user.getUserName()+"登录成功");
            return "success";
        }
        model.addAttribute("msg", "登录失败,用户名或密码不正确");
        return "fail";
    }
    
}
