package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @作者: caixiaobai
 * @时间：2020/7/20
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}") /*org.springframework.beans.factory.annotation.Value;*/
    private String serverPort;

    //正常访问的方法
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("=====result:"+result);
        return result;
    }

    //睡眠3秒之后的访问方法
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_timeout(id);
        log.info("=====result:"+result);
        return result;
    }


    //服务熔断
    @GetMapping(value = "/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id")Integer id){
        String s = paymentService.paymentCircuitBreaker(id);
        log.info("=====result:"+s);
        return s;
    }
}
