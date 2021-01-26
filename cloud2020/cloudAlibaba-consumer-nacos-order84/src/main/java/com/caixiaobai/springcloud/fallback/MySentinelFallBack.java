package com.caixiaobai.springcloud.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/26
 * time: 16:43
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class MySentinelFallBack {

    /*
    * 测试的时候没有加BlockException成功了
    * 加上的时候也成功返回了
    * */
    public static CommonResult<Payment> demo01(Long id, BlockException e){

        return new CommonResult<>(404,"服务器繁忙！");
    }
}
