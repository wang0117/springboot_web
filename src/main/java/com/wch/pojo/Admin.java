package com.wch.pojo;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月25日: 下午3:42:31
 */
@Data
@AllArgsConstructor
@ToString
public class Admin {
    
    @Id
//    private Integer id;
    private String name;
    private String password;
    

    public Admin() {
        
    }

}
