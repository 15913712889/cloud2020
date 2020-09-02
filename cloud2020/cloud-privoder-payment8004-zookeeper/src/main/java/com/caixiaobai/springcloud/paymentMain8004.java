package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @作者: caixiaobai
 * @时间：2020/7/14
 **/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient//该注解用于注册consul或者zookeeper作为注册中心注册服务
public class paymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8004.class,args);
    }
}
