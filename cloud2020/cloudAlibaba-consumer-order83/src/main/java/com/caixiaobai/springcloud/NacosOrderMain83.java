package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/29
 * time: 11:24
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain83.class,args);
    }
}
