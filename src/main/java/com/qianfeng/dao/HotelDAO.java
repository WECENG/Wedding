package com.qianfeng.dao;

import com.qianfeng.pojo.Hotel;

import java.sql.SQLException;
import java.util.List;

public interface HotelDAO {
    public void addHotel(Hotel hotel) throws SQLException;
    public List<Hotel> selectAllHotels()throws SQLException;
}
