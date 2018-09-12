package com.qianfeng.services;

import com.qianfeng.pojo.Hotel;

import java.sql.SQLException;
import java.util.List;

public interface HotelService {
    void addHotel(Hotel hotel)throws SQLException;
    List<Hotel> findAllHotels()throws SQLException;
}
