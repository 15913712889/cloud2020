package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @作者: caixiaobai
 * @时间：2020/7/20
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//激活hystrix服务降级fallback
public class PaymentHystrixMain8011 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8011.class,args);
    }
}
