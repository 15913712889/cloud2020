package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/26
 * time: 10:25
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hm = new HashMap<>();
    static {
        hm.put(1L,new Payment(1L,"1Lsjdsdsdlsklfjaldflsdjflakjdfk"));
        hm.put(2L,new Payment(2L,"2Lsjdsdsdskjdjfklasdjlkfjlsjdfk"));
        hm.put(3L,new Payment(3L,"3Lsjdsdsdlsuiouepqoueojflakjdfk"));
    }

    @RequestMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> dome(@PathVariable("id")Long id){
        Payment payment = hm.get(id);

                if (id >= 4) {
                    Integer a = 10 / 0;
                }

        return new CommonResult<>(200,"操作成功!端口号："+serverPort,payment);
    }

}
