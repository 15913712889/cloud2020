package com.caixiaobai.springcoud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/11
 * time: 15:30
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.caixiaobai.springcoud.myMapper")
//@ComponentScan(basePackages={"com.caixiaobai.springcoud.*"})//解决无法导入mapper包写的mapper
@Slf4j
public class SeataOrderService2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderService2001.class,args);
        log.info("seata-order-service2001项目启动成功！  (╥╯﹏╰╥)ง光宗耀祖支撑着我去教室");
    }
}
