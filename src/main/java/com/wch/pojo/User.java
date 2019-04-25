package com.wch.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月18日: 上午10:32:39
 */
@PropertySource(value = {"classpath:user.properties"})
@Configuration
@ConfigurationProperties(prefix="user")
public class User {

    private String userName;
    private String password;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
