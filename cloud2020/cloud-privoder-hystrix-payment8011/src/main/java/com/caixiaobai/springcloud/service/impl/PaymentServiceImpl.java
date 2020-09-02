package com.caixiaobai.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.caixiaobai.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @作者: caixiaobai
 * @时间：2020/7/20
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    /**
     * 超时错误
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            //设置自身调用的超时时间未3秒钟
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",
                    value="3000")
    })
    @Override
    public String paymentInfo_timeout(Integer id) {
        //线程超时报错
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_timeout;id:"+id+"\t"+"耗时5秒钟";
        //程序运行报错
        /*int age = 10/0;
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_timeout;id:"+id;*/
    }

    //当timeout方法失败时，会找这个方法
    @Override
    public String paymentInfo_timeoutHandler(Integer id){

        return "线程池："+Thread.currentThread().getName()+"paymentInfo_timeoutHandler;id:"+id+"系统繁忙请稍后重试！";
    }



    /**
     * 正常访问的方法
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {

        return "线程池："+Thread.currentThread().getName()+"paymentInfo_OK;id:"+id;
    }

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            //请求次数
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),
            //时间窗口期
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            //失败率达到多少后跳闸60表示60%
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")

    })
    @Override
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id <0){
            throw new RuntimeException("id不能为负数");
        }
        String uuid = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号："+uuid;
    }

    @Override
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id不能为负数，请稍后重试！id:"+id;
    }

}
