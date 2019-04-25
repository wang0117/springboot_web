package com.wch.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wch.pojo.Admin;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2018年10月23日: 下午3:25:24
 */

public interface AdminRepository extends MongoRepository<Admin, String>{
	Admin findByName(String name);
}
