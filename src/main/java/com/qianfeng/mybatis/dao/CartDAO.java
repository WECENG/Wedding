package com.qianfeng.mybatis.dao;

import com.qianfeng.pojo.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Select("select * from tb_shoppingcart where user_id=#{user_id}")
    List<Cart> selectCartByUser_id(int user_id) throws SQLException;

    /**
     *
     * 功能描述:通过购物车名称和用户id查询购物车
     *
     * @param: cart_name:购物车名称 user_id:用户id
     * @return: 返回购物车对象
     * @auther: werson
     * @date:
     */
    @Select("select * from tb_shoppingcart where cart_name=#{param1} and user_id=#{param2}")
    Cart selectCartByCart_nameAndUser_id(String cart_name, int user_id) throws SQLException;

    /**
     *
     * 功能描述:添加购物车对象
     *
     * @param: 购物车对象
     * @return:
     * @auther: werson
     * @date:
     */
    @Insert("insert into tb_shoppingcart" +
            "(user_id ,cart_time ,cart_name ,cart_type ," +
            "cart_place ,cart_price ,cart_count ,cart_img ,cart_hotelname) " +
            "values(#{user_id},#{cart_time},#{cart_name},#{cart_type},#{cart_place}" +
            ",#{cart_price},#{cart_count},#{cart_img},#{cart_hotelname})")
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
    @Update("update tb_shoppingcart set cart_count=#{param1} where cart_id=#{param2}")
    void updateCart(int cart_count, int cart_id) throws SQLException;

    /**
     *
     * 功能描述:清空购物车
     *
     * @param:
     * @return:
     * @auther: werson
     * @date:
     */
    @Delete("delete from tb_shoppingcart where user_id=#{user_id}")
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
    @Delete("delete from tb_shoppingcart where cart_id=#{cart_id}")
    void deleteCart(int cart_id) throws SQLException;
}
