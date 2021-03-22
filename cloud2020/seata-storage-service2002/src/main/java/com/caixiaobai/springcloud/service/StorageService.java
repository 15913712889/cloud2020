package com.caixiaobai.springcloud.service;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 11:27
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public interface StorageService {

    void  decrease(Long productId ,Integer count);
}
