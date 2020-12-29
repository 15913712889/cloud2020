package com.caixiaobai.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/22
 * time: 15:16
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPost;

    @GetMapping(value="/payment/nacos/{id}")
    private String getPayment(@PathVariable("id") Integer id){
        return "nacos registry,serverPort:"+serverPost+"\t id="+id;
    }
}
