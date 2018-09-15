package com.qianfeng.dao.impl;

import com.qianfeng.dao.CartDAO;
import com.qianfeng.pojo.Cart;
import com.qianfeng.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 14:21
 * @Description:    购物车数据访问层实现类
 */
@Repository
public class CartDAOimpl implements CartDAO {
    @Autowired
    DataSource dataSource;

    @Override
    public List<Cart> selectCartByUser_id(int user_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_shoppingcart where user_id=?",
                new BeanListHandler<>(Cart.class),user_id);
    }

    @Override
    public Cart selectCartByCart_nameAndUser_id(String cart_name, int user_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_shoppingcart where cart_name=? and user_id=?",
                new BeanHandler<>(Cart.class),cart_name,user_id);
    }

    @Override
    public void addCart(Cart cart) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        runner.update("insert into tb_shoppingcart" +
                "(user_id ,cart_time ,cart_name ,cart_type ," +
                "cart_place ,cart_price ,cart_count ,cart_img ,cart_hotelname) " +
                        "values(?,?,?,?,?,?,?,?,?)",
                cart.getUser_id(),cart.getCart_time(),cart.getCart_name(),
                cart.getCart_type(),cart.getCart_place(),cart.getCart_price(),
                cart.getCart_count(),cart.getCart_img(),cart.getCart_hotelname());
    }

    @Override
    public void updateCart(int cart_count,int cart_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        runner.update("update tb_shoppingcart set cart_count=? where cart_id=?",
                cart_count,cart_id);
    }

    @Override
    public void clearCart(int user_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        runner.update("delete from tb_shoppingcart where user_id=?",user_id);
    }

    @Override
    public void deleteCart(int cart_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        runner.update("delete from tb_shoppingcart where cart_id=?",cart_id);
    }
}
