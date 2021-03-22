package com.caixiaobai.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 10:58
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
@MapperScan("com.caixiaobai.springcloud.myMapper")
public class SeataStorageService2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageService2002.class,args);
        log.info("seata-storage-service2002项目启动成功！  (╥╯﹏╰╥)ง光宗耀祖支撑着我去教室");
    }
}
