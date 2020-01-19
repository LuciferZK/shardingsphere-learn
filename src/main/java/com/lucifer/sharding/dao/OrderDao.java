package com.lucifer.sharding.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lucifer.sharding.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Lucifer
 */
public interface OrderDao extends BaseMapper<Order> {


    @Select("select * from t_order where user_id=#{userId} limit #{pageNum},#{pageSize}")
    List<Order> findOrders(@Param("userId") Integer userId,@Param("pageNum") Long PageNum,@Param("pageSize") Long pageSize);
}

