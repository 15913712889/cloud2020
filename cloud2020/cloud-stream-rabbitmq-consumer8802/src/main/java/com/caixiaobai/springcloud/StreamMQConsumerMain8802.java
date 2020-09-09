package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @作者: caixiaobai
 * @时间：2020/09/08
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQConsumerMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQConsumerMain8802.class,args);
    }
}
