package com.qianfeng.dao;

import com.qianfeng.pojo.Cart;
import com.qianfeng.pojo.Order;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 14:16
 * @Description:    购物车数据访问层
 */
public interface CartDAO {
    /**
     *
     * 功能描述: 通过用户id查询购物车集合
     *
     * @param: user_id:用户id
     * @return: 返回购物车对象集合
     * @auther: werson
     * @date:
     */
    List<Cart> selectCartByUser_id(int user_id) throws SQLException;

    /**
     *
     * 功能描述:通过购物车名称查询购物车
     *
     * @param: cart_name:购物车名称
     * @return: 返回购物车对象
     * @auther: werson
     * @date:
     */
    Cart selectCartByCart_name(String cart_name) throws SQLException;

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
