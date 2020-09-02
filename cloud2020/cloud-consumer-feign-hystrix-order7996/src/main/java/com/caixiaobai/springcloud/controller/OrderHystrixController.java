package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @作者: caixiaobai
 * @时间：2020/7/27
 **/
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "paymentInfo_default_fallback")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    //正常访问的方法
    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id")Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    //睡眠3秒之后的访问方法
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
   /* @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            //设置自身调用的超时时间未3秒钟
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",
                    value="1500")
    })*/
    //@HystrixCommand
    public String paymentInfo_timeout(@PathVariable("id") Integer id){

        return paymentHystrixService.paymentInfo_timeout(id);
    }



    public String paymentInfo_timeoutHandler(Integer id){

        return "我是消费者7996，对方支付系统繁忙或运行出错请稍后重试！";
    }

    public String paymentInfo_default_fallback(){
        return "全局异常处理，请稍后再试！";
    }
}
