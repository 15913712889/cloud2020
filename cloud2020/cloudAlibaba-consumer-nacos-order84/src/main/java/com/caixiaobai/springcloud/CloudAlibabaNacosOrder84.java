package com.caixiaobai.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/26
 * time: 11:02
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class CloudAlibabaNacosOrder84 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosOrder84.class,args);
        log.info("我不休息我还能学    ⊂(‘ω’⊂ )))Σ≡=─！项目启动成功！");
    }
}
