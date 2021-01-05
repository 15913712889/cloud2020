package com.caixiaobai.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/04
 * time: 16:39
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication
@Slf4j
public class NacosConfigClient3377 {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigClient3377.class,args);

        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        log.info("user name :" +userName+"; age: "+userAge);
        log.info("项目启动成功！");
    }
}
