package com.caixiaobai.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @作者: caixiaobai
 * @时间：2020/7/27
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "======PaymentFallbackService fallback,=====paymentInfo_OK";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "=====PaymentFallbackService fallback,=====paymentInfo_timeout";
    }
}
