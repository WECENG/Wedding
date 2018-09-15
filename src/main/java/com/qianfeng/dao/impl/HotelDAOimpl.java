package com.qianfeng.dao.impl;

import com.qianfeng.dao.HotelDAO;
import com.qianfeng.pojo.Hotel;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@Repository
public class HotelDAOimpl implements HotelDAO {
    @Autowired
    DataSource dataSource;

    @Override
    public void addHotel(Hotel hotel) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        runner.update("insert into tb_hotel values(?,?,?,?,?)"
                ,hotel.getHotel_id(),hotel.getHotel_name(),hotel.getHotel_tel(),
                hotel.getHotel_star(),hotel.getHotel_img());
    }

    @Override
    public List<Hotel> selectAllHotels() throws SQLException{
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_hotel",new BeanListHandler<>(Hotel.class));
    }

    @Override
    public Hotel selectHotelByHotel_id(int hotel_id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSource);
        return runner.query("select * from tb_hotel where hotel_id=?",
                new BeanHandler<>(Hotel.class),hotel_id);
    }
}
