package com.caixiaobai.springcoud.myMapper;

import com.caixiaobai.springcoud.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/11
 * time: 15:57
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Mapper
public interface OrderMapper {
    @Insert("<script>" +
            "insert into t_order(user_id,product_id,count,money,status) values (#{order.userId},#{order.productId},#{order.count},#{order.money},0)" +
            "</script>")
    void create(Order order);

    @Update("<script>" +
            "update t_order set status =1 where user_id =#{userId} and status=#{status}" +
            "</script>")
    void update(@Param("userId") Long userId,@Param("status")Integer status);
}
