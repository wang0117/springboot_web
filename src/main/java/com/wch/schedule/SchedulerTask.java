package com.wch.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月24日: 下午4:21:08
 */
@Component
public class SchedulerTask {
    
    int count=1;
    @Scheduled(cron="* * 8 * * ?")
    public void test(){
        System.out.println("test:"+(count++));
    }
}
