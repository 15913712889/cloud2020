package com.caixiaobai.springcloud.config;

import com.caixiaobai.springcloud.service.PaymentFallBackService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/27
 * time: 15:58
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */

public class FeignConfiguration {
    @Bean
    public PaymentFallBackService echoServiceFallback() {
        return new PaymentFallBackService();
    }
}
