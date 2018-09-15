package com.qianfeng.services;

import com.qianfeng.pojo.Cart;
import com.qianfeng.pojo.Order;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 14:26
 * @Description:    购物车详情业务逻辑层
 */
public interface CartService {
    /**
     *
     * 功能描述: 通过用户id查询购物车集合
     *
     * @param: user_id:用户id
     * @return: 返回购物车对象集合
     * @auther: werson
     * @date:
     */
    List<Cart> findCartByUser_id(int user_id) throws SQLException;

    /**
     *
     * 功能描述:通过购物车名称和用户id查询购物车
     *
     * @param: cart_name:购物车名称 user_id:用户id
     * @return: 返回购物车对象
     * @auther: werson
     * @date:
     */
    Cart findCartByCart_nameAndUser_id(String cart_name,int user_id) throws SQLException;

    /**
     *
     * 功能描述:添加购物车对象
     *
     * @param: 购物车对象
     * @return:
     * @auther: werson
     * @date:
     */
    void addCart(Cart cart) throws SQLException;

    /**
     *
     * 功能描述:    更新单个购物的了数量
     *
     * @param:  cart_count：购物车数量
     * @return:
     * @auther: werson
     * @date:
     */
    void updateCart(int cart_count,int cart_id) throws SQLException;

    /**
     *
     * 功能描述:清空购物车
     *
     * @param:
     * @return:
     * @auther: werson
     * @date:
     */
    void clearCart(int user_id) throws SQLException;

    /**
     *
     * 功能描述:通过购物车id删除单条购物车记录
     *
     * @param: cart_id 购物车id
     * @return:
     * @auther: werson
     * @date:
     */
    void deleteCart(int cart_id) throws SQLException;

}
