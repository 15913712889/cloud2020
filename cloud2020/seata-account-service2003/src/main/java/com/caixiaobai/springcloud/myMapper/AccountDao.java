package com.caixiaobai.springcloud.myMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 14:59
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Mapper
public interface AccountDao {
    @Update("<script>" +
            "UPDATE t_account " +
            "set " +
            "reside = reside -#{money},used = used + #{money} " +
            "where " +
            "user_id = #{userId} " +
            "</script>")
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
