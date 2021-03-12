package com.caixiaobai.springcoud.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/11
 * time: 15:48
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Data//生成get、set、toString方法
@AllArgsConstructor//生成全参数构造函数
@NoArgsConstructor// 生成无参构造函数
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;
    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
