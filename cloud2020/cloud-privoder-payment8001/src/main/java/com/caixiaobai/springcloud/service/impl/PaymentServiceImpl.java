package com.caixiaobai.springcloud.service.impl;

import com.caixiaobai.springcloud.dao.PaymentDao;
import com.caixiaobai.springcloud.entities.Payment;
import com.caixiaobai.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource//这个是java自带的依赖注入
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
