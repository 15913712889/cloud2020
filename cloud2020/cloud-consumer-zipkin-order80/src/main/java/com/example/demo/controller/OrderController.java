package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/21
 * time: 14:05
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
@Slf4j
public class OrderController {

    //写的是erreka中暴露的服务名
    //public static final String PAYMENT_URL = "http://CLOUD-PRIVODER-ZIPKIN-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/zipkin")
    @ResponseBody
    public String paymentZipkin(){
        String result = restTemplate.getForObject("http://localhost:8001" + "/payment/zipkin/", String.class);
        return result;
    }
}
