package com.qianfeng.services.impl;

import com.qianfeng.dao.CartDAO;
import com.qianfeng.pojo.Cart;
import com.qianfeng.pojo.Order;
import com.qianfeng.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 14:27
 * @Description:
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartDAO cartDAO;

    @Override
    public List<Cart> findCartByUser_id(int user_id) throws SQLException {
        return cartDAO.selectCartByUser_id(user_id);
    }

    @Override
    public Cart findCartByCart_nameAndUser_id(String cart_name,int user_id) throws SQLException {
        return cartDAO.selectCartByCart_nameAndUser_id(cart_name,user_id);
    }

    @Override
    public void addCart(Cart cart) throws SQLException {
        cartDAO.addCart(cart);
    }

    @Override
    public void updateCart(int cart_count, int cart_id) throws SQLException {
        cartDAO.updateCart(cart_count,cart_id);
    }

    @Override
    public void clearCart(int user_id) throws SQLException {
        cartDAO.clearCart(user_id);
    }

    @Override
    public void deleteCart(int cart_id) throws SQLException {
        cartDAO.deleteCart(cart_id);
    }
}
