package com.caixiaobai.springcloud.service.impl;

import com.caixiaobai.springcloud.myMapper.StorageDao;
import com.caixiaobai.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 11:28
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    //@Transactional(rollbackFor = Exception.class)
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中减扣库存开始！");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中减扣库存结束！");
    }
}
