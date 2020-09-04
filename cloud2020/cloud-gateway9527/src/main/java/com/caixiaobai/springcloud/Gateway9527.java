package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @作者: caixiaobai
 * @时间：2020/09/03
 **/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class Gateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527.class,args);
    }
}
