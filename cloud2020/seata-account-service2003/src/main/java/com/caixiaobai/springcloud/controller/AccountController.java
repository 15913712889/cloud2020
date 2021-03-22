package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.result.CommonResult;
import com.caixiaobai.springcloud.service.AccountService;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 15:10
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId")Long userId, @RequestParam("money") BigDecimal money){

        // 获取 XID
        String xid = RootContext.getXID();
        System.out.println("xid="+xid);
        //测试没加seata事务注解，超时异常
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        accountService.decrease(userId, money);
        return new CommonResult(200,"账户余额扣款成功！");
    }

}
