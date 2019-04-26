package com.wch.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wch.pojo.Admin;
import com.wch.pojo.User;
import com.wch.service.AdminRepository;
import com.wch.service.AdminService;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月18日: 上午10:31:42
 */
@Controller
public class UserController {
    
    @Autowired
    private User user;
    
    @Autowired
    private AdminRepository adminRepository;
    @Resource
    private AdminService adminService;
    
    @RequestMapping("/login")
    public String query(String name,String password,Model model){
        if(name == null || name == ""){
            model.addAttribute("msg", "登录失败,用户名不能为空");
            return "fail";
        }
        if(password == null || password == ""){
            model.addAttribute("msg", "登录失败,密码不能为空");
            return "fail";
        }
        Admin admin = findByName(name);
        if(admin == null){
            model.addAttribute("msg", "登录失败,用户名未注册");
            return "fail";
        }
        
        if(name.equals(admin.getName()) && password.equals(admin.getPassword())){
            model.addAttribute("msg", "用户"+admin.getName()+"登录成功");
            return "success";
        }
        model.addAttribute("msg", "登录失败,用户名或密码不正确");
        return "fail";
    }
    
    
    public Admin findByName(String userName){
        return adminRepository.findByName(userName);
    }
    
    @RequestMapping("/toSaveAdmin")
    public String toSaveAdmin(){
        return "addAdmin";
    }
    
    @RequestMapping("/save")
    public String saveAdmin(String name,String password, Model model){
        Admin admin = new Admin(name, password);
        adminRepository.save(admin);
        adminService.save(admin);
        model.addAttribute("msg", "注册成功");
        return "success";
    }
    
    @RequestMapping("/back")
    public String back(){
        return "redirect:index.html";
    }
    
}
