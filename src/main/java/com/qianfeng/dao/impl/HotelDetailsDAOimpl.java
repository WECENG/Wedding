package com.qianfeng.dao.impl;

import com.qianfeng.dao.HotelDetailsDAO;
import com.qianfeng.pojo.HotelDetails;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.HotelRoom;
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
 * @Date: 2018/9/13/013 10:48
 * @Description:    酒店详情数据访问层实现类
 */
@Repository
public class HotelDetailsDAOimpl implements HotelDetailsDAO {
    @Autowired
    DataSource dataSource;
    @Override
    public List<HotelDetails> selectAllHotelDetails() throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_hotelinfo",
                new BeanListHandler<>(HotelDetails.class));
    }

    @Override
    public HotelDetails selectHotelDetailsByHotel_id(int hotel_id) throws SQLException{
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_hotelinfo where hotel_id=?",
                new BeanHandler<>(HotelDetails.class),hotel_id);
    }

    @Override
    public List<HotelPackage> selectAllHotelPackage() throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_package",
                new BeanListHandler<>(HotelPackage.class));
    }

    @Override
    public List<HotelPackage> selectHotelPackageByHotel_id(int hotel_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_package where hotel_id=?",
                new BeanListHandler<>(HotelPackage.class),hotel_id);
    }

    @Override
    public List<HotelRoom> selectAllHotelRoom() throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_room",
                new BeanListHandler<>(HotelRoom.class));
    }

    @Override
    public List<HotelRoom> selectHotelRoomByHotel_id(int hotel_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_room where hotel_id=?",
                new BeanListHandler<>(HotelRoom.class),hotel_id);
    }
}
