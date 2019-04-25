package com.wch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wch.pojo.Admin;
import com.wch.service.AdminRepository;
import com.wch.service.AdminService;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:28:10
 */
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public void save(Admin user) {
	    adminRepository.save(user);
		
	}
	
	@Override
	public Admin findByName(String name) {
		return this.findByName(name);
	}

}
