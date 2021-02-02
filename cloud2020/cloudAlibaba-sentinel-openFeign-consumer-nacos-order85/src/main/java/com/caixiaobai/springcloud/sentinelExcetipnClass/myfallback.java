package com.caixiaobai.springcloud.sentinelExcetipnClass;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.caixiaobai.springcloud.entities.CommonResult;
import com.caixiaobai.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/02/01
 * time: 16:26
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class myfallback {

    public static CommonResult<Payment> demo1(Long id,BlockException ex){
        return new CommonResult<>(202,"当前应用被sentinel限流了,请稍后再试！"+ex.getMessage());
    }


    //做为fallback的异常处理方法
    public static CommonResult<Payment> demo2(Long id,Throwable t){
        return new CommonResult<>(202,"处理了业务异常！"+t.getMessage());
    }
}
