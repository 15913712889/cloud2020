package com.caixiaobai.springcloud.myMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 11:20
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Mapper
public interface StorageDao {
    //扣减库存
    @Update("<script>"+
            "UPDATE " +
            "t_storage " +
            "SET " +
            "used = used + #{count},reside = reside - #{count} " +
            "WHERE " +
            "product_id = #{productId} "+
            "</script>")
    void decrease (@Param("productId") Long productId, @Param("count") Integer count);
}
