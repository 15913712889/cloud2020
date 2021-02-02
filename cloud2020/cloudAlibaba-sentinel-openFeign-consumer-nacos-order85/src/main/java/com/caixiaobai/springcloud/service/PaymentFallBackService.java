package com.caixiaobai.springcloud.service;

import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;
import org.springframework.stereotype.Component;


/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/27
 * time: 15:11
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Component
public class PaymentFallBackService implements PaymentService1{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(404,"服务器繁忙！",new Payment(id,"errors"));
    }


}
