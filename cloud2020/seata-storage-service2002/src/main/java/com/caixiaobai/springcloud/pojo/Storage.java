package com.caixiaobai.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 11:10
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
public class Storage {

    private Long id;
    //产品id
    private Long productId;
    //总库存
    private Integer total;
    //已用库存
    private Integer used;
    //剩余库存
    private Integer reside;
}
