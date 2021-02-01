package com.caixiaobai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/27
 * time: 14:50
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//激活
public class SentinelOpenFeignOrder85 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelOpenFeignOrder85.class,args);
    }
}
