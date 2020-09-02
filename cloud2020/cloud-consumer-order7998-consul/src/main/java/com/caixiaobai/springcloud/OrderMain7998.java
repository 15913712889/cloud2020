package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @作者: caixiaobai`
 * @时间：2020/7/15
 **/
@SpringBootApplication
@EnableDiscoveryClient//消费者注册进consul
public class OrderMain7998 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain7998.class,args);
    }
}
