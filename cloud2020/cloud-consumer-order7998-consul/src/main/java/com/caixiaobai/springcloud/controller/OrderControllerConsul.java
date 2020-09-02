package com.caixiaobai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @作者: caixiaobai
 * @时间：2020/7/15
 **/
@RestController
@Slf4j
public class OrderControllerConsul {

    private static final String INVOKE_URL = "http://consul-privoder-payment8006-consul";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
