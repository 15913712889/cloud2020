package com.caixiaobai.springcloud;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/26
 * time: 10:14
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@EnableDiscoveryClient//服务发现
@SpringBootApplication
@Slf4j
public class SentinelPrivatePayment9004 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelPrivatePayment9004.class,args);
        log.info("(σﾟ∀ﾟ)σ..:*☆哎哟不错哦，项目启动成功！！！");
    }
}
