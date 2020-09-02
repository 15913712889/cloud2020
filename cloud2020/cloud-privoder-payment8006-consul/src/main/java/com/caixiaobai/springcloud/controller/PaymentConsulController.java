package com.caixiaobai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @作者: caixiaobai
 * @时间：2020/7/15
 **/
@RestController
@Slf4j
public class PaymentConsulController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String payemntConsul(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
