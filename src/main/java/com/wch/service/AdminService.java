package com.wch.service;

import org.springframework.stereotype.Repository;

import com.wch.pojo.Admin;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:26:38
 */
@Repository
public interface AdminService {
	void save(Admin user);

	Admin findByName(String name);
}
