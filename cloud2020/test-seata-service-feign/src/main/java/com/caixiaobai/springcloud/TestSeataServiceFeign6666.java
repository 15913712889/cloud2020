package com.caixiaobai.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/16
 * time: 15:07
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class TestSeataServiceFeign6666 {
    public static void main(String[] args) {
        SpringApplication.run(TestSeataServiceFeign6666.class,args);
        log.info("恭喜项目启动完成！");
    }
}
