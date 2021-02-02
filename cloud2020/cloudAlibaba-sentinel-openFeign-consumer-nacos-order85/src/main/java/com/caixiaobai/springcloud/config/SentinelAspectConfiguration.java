package com.caixiaobai.springcloud.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/02/01
 * time: 17:06
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Configuration
public class SentinelAspectConfiguration {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
}
