package com.caixiaobai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;//消息代码
    private String message;//消息信息
    private T      data;//数据

    /**
     * 当data数据为null的情况，使用的方法
     * @param code
     * @param message
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
