package com.qianfeng.services;

import com.qianfeng.pojo.Order;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 15:40
 * @Description:    订单详情业务逻辑层
 */
public interface OrderService {
    /**
     *
     * 功能描述: 通过用户id查询订单集合
     *
     * @param: user_id:用户id
     * @return: 返回订单详情集合
     * @auther: werson
     * @date:
     */
    List<Order> findOrdersByUser_id(int user_id) throws SQLException;
}
