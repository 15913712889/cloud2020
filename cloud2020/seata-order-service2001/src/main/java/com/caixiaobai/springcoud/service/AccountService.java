package com.caixiaobai.springcoud.service;

import com.caixiaobai.springcoud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/12
 * time: 10:29
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@FeignClient(value = "seata-account-service2003")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("money") BigDecimal money);

}
