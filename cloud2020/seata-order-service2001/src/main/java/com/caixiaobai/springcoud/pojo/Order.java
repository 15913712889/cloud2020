package com.caixiaobai.springcoud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/11
 * time: 15:53
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Data//生成get、set、toString方法
@AllArgsConstructor//生成全参数构造函数
@NoArgsConstructor// 生成无参构造函数
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;//订单状态： 0-创建中，1-已完成
}
