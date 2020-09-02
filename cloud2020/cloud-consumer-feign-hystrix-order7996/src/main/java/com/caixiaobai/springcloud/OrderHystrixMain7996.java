package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @作者: caixiaobai
 * @时间：2020/7/27
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix//激活
public class OrderHystrixMain7996 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain7996.class,args);
    }
}
