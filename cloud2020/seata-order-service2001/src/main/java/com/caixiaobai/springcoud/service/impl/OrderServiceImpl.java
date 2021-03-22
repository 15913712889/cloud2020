package com.caixiaobai.springcoud.service.impl;



import com.caixiaobai.springcoud.myMapper.OrderMapper;
import com.caixiaobai.springcoud.pojo.Order;

import com.caixiaobai.springcoud.service.AccountService;
import com.caixiaobai.springcoud.service.OrderService;

import com.caixiaobai.springcoud.service.StorageService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/11
 * time: 16:24
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Autowired
    private StorageService storageService;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AccountService accountService;

    @Override
    //@GlobalTransactional(rollbackFor = Exception.class)//名字随便定义，rollbackFor表示哪些异常要回滚，还有多个参数
    //@Transactional(rollbackFor = Exception.class)
    public void create(Order order) {

        // 获取 XID
        String xid = RootContext.getXID();
        System.out.println("xid="+xid);
        log.info("--------->开始新建订单");
        //1 新建订单
        orderMapper.create(order);
        //2 扣减库存
        log.info("------------->订单微服务开始调用库存,做扣减Count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------------->订单微服务开始调用库存,做扣减end");
        //3 扣减账户
        log.info("------------->订单微服务开始调用账户,做扣减Money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------------->订单微服务开始调用账户,做扣减end");
        //4 修改订单状态
        log.info("------------->修改订单状态开始");
        orderMapper.update(order.getUserId(),0);
        log.info("------------->修改订单状态结束");
        log.info("------------->下订单结束了");
    }
}
