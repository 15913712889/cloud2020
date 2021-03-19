package com.caixiaobai.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 14:56
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
public class Account {
    private Long id;
    //用户id
    private Long userId;
    //总额度
    private BigDecimal total;
    //已用额度
    private BigDecimal used;
    //剩余余额
    private BigDecimal reside;
}
