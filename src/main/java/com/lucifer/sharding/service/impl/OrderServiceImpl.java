package com.lucifer.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lucifer.sharding.dao.OrderDao;
import com.lucifer.sharding.pojo.Order;
import com.lucifer.sharding.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * @author Lucifer
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderDao orderDao;

    @Override
    public void addOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setPrice(BigDecimal.valueOf(0.1));
            order.setUserId(1111L);
            order.setStatus("0");
            orderDao.insert(order);
        }
    }

    @Override
    public void findOrder() {
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id", 3966759452543954641L);
        orderDao.selectList(queryWrapper);
    }
}
