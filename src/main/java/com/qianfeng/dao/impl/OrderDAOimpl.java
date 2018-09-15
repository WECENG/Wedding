package com.qianfeng.dao.impl;

import com.qianfeng.dao.OrderDAO;
import com.qianfeng.pojo.Order;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 15:38
 * @Description:    订单详情数据访问层实现类
 */
@Repository
public class OrderDAOimpl implements OrderDAO {
    @Autowired
    DataSource dataSource;

    @Override
    public List<Order> selectOrdersByUser_id(int user_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_order where user_id=?",
                new BeanListHandler<>(Order.class),user_id);
    }
}
