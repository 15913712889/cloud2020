package com.caixiaobai.springcoud;

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
 * date: 2021/03/11
 * time: 15:30
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
//@MapperScan(value = "com.caixiaobai.springcoud.myMapper")
@ComponentScan(basePackages={"com.caixiaobai.springcoud.myMapper"})//解决无法导入mapper包写的mapper
public class SeataOrderService2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderService2001.class,args);
    }
}
