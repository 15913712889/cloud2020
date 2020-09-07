package com.caixiaobai.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者: caixiaobai
 * @时间：2020/09/07
 **/
@RestController
@RefreshScope //刷新注解
public class ConfigCilentController {

    @Value("${config.info}")
    private String configInfo;
    //以rest风格的方式暴露配置信息
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
