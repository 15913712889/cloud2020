package com.caixiaobai.springcloud.dao;

import com.caixiaobai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper//也可以在启动类上使用注解@MapperScan,也可以在创建mybatis的配置文件中指定
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
