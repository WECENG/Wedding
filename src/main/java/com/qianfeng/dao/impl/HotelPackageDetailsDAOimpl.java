package com.qianfeng.dao.impl;

import com.qianfeng.dao.HotelPackageDetailsDAO;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.HotelRoom;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 20:58
 * @Description:    酒店套餐详情数据访问层实现类
 */
@Repository
public class HotelPackageDetailsDAOimpl implements HotelPackageDetailsDAO {
    @Autowired
    DataSource dataSource;
    @Override
    public HotelPackage selectHotelPackageByPackage_id(int package_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_package where package_id=?",
                new BeanHandler<>(HotelPackage.class),package_id);
    }
}
