package com.caixiaobai.springcloud.service.impl;

import com.caixiaobai.springcloud.myMapper.AccountDao;
import com.caixiaobai.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 15:05
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->account service 中扣减账户余额开始");
        accountDao.decrease(userId, money);
        log.info("-------->account service 中扣减账户余额结束");
    }
}
