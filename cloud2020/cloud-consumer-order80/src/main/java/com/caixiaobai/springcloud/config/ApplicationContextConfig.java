package com.caixiaobai.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced//这个注解实现负载均衡，当同一个服务名，有多个服务的时候，才不会报错
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
