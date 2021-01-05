package com.caixiaobai.springcloud.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/05
 * time: 10:00
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
@RefreshScope//支持动态刷新获取到的配置，配置文件中必须要开启动态刷新
public class NacosConfigController {

    @Value("${user.age}")//这个支持动态刷新
    private Integer userAge;

    @NacosValue("${user.age}")//这个无法获取值
    private Integer NacosUserAge;

    @RequestMapping("/get/value")
    public String demo01(){
        return "年龄为："+userAge;
    }

    @RequestMapping("/get/nacosvalue")
    public String demo02(){
        return "年龄为："+NacosUserAge;
    }
}
