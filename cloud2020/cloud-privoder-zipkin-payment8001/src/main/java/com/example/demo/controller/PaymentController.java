package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/21
 * time: 11:05
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class PaymentController {

    @RequestMapping("/payment/zipkin")
    @ResponseBody
    public String paymentZipkin(){
        return "hi,i'am paymentzipkin server fall back, welcome to caixiaobai, 哈哈";
    }

}
