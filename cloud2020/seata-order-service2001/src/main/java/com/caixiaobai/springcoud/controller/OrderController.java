package com.caixiaobai.springcoud.controller;

import com.caixiaobai.springcoud.pojo.Order;
import com.caixiaobai.springcoud.result.CommonResult;
import com.caixiaobai.springcoud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/12
 * time: 10:46
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建完成");
    }
}
