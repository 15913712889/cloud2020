package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @作者: caixiaobai
 * @时间：2020/09/09
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQConsumerMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQConsumerMain8803.class,args);
    }
}
