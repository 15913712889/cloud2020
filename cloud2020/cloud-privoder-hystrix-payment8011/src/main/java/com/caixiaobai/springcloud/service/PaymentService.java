package com.caixiaobai.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @作者: caixiaobai
 * @时间：2020/7/20
 **/
public interface PaymentService {

    //当timeout方法失败时，会找这个方法
    String paymentInfo_timeoutHandler(Integer id);

    /**
     * 测试正常访问
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id);

    /**
     * 测试访问超时出错
     * @param id
     * @return
     */
    public String paymentInfo_timeout(Integer id);

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少后跳闸
    })
    String paymentCircuitBreaker(@PathVariable("id") Integer id);

    String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id);
}
