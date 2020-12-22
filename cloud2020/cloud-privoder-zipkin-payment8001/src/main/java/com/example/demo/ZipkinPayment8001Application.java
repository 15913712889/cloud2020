package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/21
 * time: 15:26
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class ZipkinPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinPayment8001Application.class,args);
    }
}
