package com.qianfeng.services.impl;

import com.qianfeng.mybatis.dao.OrderDAO;
import com.qianfeng.pojo.Order;
import com.qianfeng.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 15:42
 * @Description:    订单详情业务逻辑层实现类
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO orderDAO;

    @Override
    public List<Order> findOrdersByUser_id(int user_id) throws SQLException {
        return orderDAO.selectOrdersByUser_id(user_id);
    }
}
