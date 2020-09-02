package com.caixiaobai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @作者: caixiaobai
 * @时间：2020/7/14
 **/
@RestController
@Slf4j
public class OrderMainZkController {

    public static final String INVOKE_URL = "http://cloud-privoder-payment8004-zookeeper";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }
}
