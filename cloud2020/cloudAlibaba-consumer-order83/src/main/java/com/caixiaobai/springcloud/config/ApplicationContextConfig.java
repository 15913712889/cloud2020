package com.caixiaobai.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/29
 * time: 11:26
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Configuration
public class ApplicationContextConfig {
    /**
     *  因为nacos自带负载均衡，所以集成了ribbon
     * @return
     */
    @Bean
    @LoadBalanced//这个注解要加，不然调用不成功
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
