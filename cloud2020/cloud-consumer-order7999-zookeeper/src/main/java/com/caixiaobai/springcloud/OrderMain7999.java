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
@EnableDiscoveryClient
public class OrderMain7999 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain7999.class,args);
    }
}
