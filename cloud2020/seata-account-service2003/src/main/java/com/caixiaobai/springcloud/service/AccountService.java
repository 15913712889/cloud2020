package com.caixiaobai.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 15:04
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public interface AccountService {
    void decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money);
}
