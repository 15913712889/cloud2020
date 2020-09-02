package com.caixiaobai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @作者: caixiaobai
 * @时间：2020/7/14
 **/
@RestController
@Slf4j
public class paymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value="/payment/zk")
    public String paymentzk(){
       return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
