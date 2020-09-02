package com.caixiaobai.springcloud.service;

import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @作者: caixiaobai
 * @时间：2020/7/17
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")long id);


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
