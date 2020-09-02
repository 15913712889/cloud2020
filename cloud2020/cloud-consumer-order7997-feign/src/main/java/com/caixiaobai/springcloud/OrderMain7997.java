package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @作者: caixiaobai
 * @时间：2020/7/17
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain7997 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain7997.class,args);
    }
}
