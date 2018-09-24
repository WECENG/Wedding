package com.qianfeng.mybatis.mapper;

import com.qianfeng.pojo.Order;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 15:36
 * @Description:    订单详情数据访问层
 */
public interface OrderMapper {
    /**
     *
     * 功能描述: 通过用户id查询订单集合
     *
     * @param: user_id:用户id
     * @return: 返回订单详情集合
     * @auther: werson
     * @date:
     */
    @Select("select * from tb_order where user_id=#{user_id}")
    List<Order> selectOrdersByUser_id(int user_id) throws SQLException;
}
