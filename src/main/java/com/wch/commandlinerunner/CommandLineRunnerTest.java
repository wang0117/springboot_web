package com.wch.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Description:   
 * @author wangchenghong 
 * @since: 2019年4月24日: 下午5:58:54
 */
@Component
public class CommandLineRunnerTest  implements CommandLineRunner{

     
    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("CommandLineRunner启动");
        
    }

}
