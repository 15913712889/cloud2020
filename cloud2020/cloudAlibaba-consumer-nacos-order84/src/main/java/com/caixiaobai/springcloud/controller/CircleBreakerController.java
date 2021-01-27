package com.caixiaobai.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;
import com.caixiaobai.springcloud.fallback.MySentinelFallBack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/26
 * time: 11:16
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
@Slf4j
public class CircleBreakerController {

    public static final String SERVICE_URL = "http://nacos-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/fallback/{id}")
    //@SentinelResource(value = "fallBack")//这个配置直接返回错误页面，给用户不友好的体验
    @SentinelResource(value = "fallBack",fallback = "demo01",
            fallbackClass = MySentinelFallBack.class
            ,exceptionsToIgnore = {IllegalArgumentException.class})//这个属性是排除某个异常不处理
    public CommonResult<Payment> demo01(@PathVariable Long id){
        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL+"/paymentSQL/"+id,CommonResult.class,id);
        if(id==4){
            throw new IllegalArgumentException("IllegalAccessException,非法参数异常");
        }else if(result.getData()==null){
            throw new NullPointerException("空指针异常！");
        }
        return result;
    }

    @RequestMapping(value = "/demo02")
    public String demo02(){
        return "测试请求！";
    }
}
