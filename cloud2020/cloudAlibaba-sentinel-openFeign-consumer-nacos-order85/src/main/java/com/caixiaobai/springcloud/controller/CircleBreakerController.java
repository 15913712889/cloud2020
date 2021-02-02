package com.caixiaobai.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;

import com.caixiaobai.springcloud.sentinelExcetipnClass.myfallback;
import com.caixiaobai.springcloud.service.PaymentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/27
 * time: 15:16
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class CircleBreakerController {

    @Autowired
    private PaymentService1 paymentService1;

    @RequestMapping(value = "/consumer/paymentSQL/{id}")
    //@SentinelResource(value = "fallback",fallback = "demo2",fallbackClass = myfallback.class)//fallback负责业务异常返回结果,限流异常正常返回error page
    //@SentinelResource(value = "fallback",blockHandler = "demo1",blockHandlerClass = myfallback.class)//负责sentinel限流异常返回结果,业务异常正常返回error page
    @SentinelResource(value = "fallback",
            fallback = "demo2",fallbackClass = myfallback.class,
            blockHandler = "demo1",blockHandlerClass = myfallback.class)
            //如果fallback和blockhandler都配置了的情况，当正常访问没有超过sentinel设置的相应规则，就正常返回查询结果，如果超过了就返回blockHandler配置的返回
            //如果没有超过sentinel设置的规则，提供者内部出现了问题，就返回fallback配置的返回方法
            //如果提供者内部出现了问题，在没有超过sentinel设置的规则的时候返回fallback配置的方法。如果超过了就返回blockHandler配置的方法
    public CommonResult<Payment> paymentSQL(@PathVariable("id")Long id){
        return paymentService1.paymentSQL(id);
    }
}
