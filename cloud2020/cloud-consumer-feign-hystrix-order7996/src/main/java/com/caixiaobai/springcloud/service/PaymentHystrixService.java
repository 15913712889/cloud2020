package com.caixiaobai.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @作者: caixiaobai
 * @时间：2020/7/27
 * 省略了实现类
 **/
@Component
@FeignClient(value = "CLOUD-PRIVODER-HYSTRIX-PAYMENT8011",
        fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    //正常访问的方法
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id")Integer id);

    //睡眠3秒之后的访问方法
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id);
}
