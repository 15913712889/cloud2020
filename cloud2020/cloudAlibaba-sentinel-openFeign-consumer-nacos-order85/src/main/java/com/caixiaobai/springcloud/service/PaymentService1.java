package com.caixiaobai.springcloud.service;

import com.caixiaobai.springcloud.config.FeignConfiguration;
import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/27
 * time: 14:55
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Component
@FeignClient(name = "nacos-provider-payment",fallback = PaymentFallBackService.class)
public interface PaymentService1 {

    @RequestMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
