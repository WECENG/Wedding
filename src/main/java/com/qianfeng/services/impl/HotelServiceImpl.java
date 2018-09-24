package com.qianfeng.services.impl;

import com.qianfeng.mybatis.mapper.HotelMapper;
import com.qianfeng.pojo.Hotel;
import com.qianfeng.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelMapper hotelDAO;
    @Override
    public void addHotel(Hotel hotel) throws SQLException {
        hotelDAO.addHotel(hotel);
    }

    @Override
    public List<Hotel> findAllHotels() throws SQLException {
        return hotelDAO.selectAllHotels();
    }

    @Override
    public Hotel findHotelByHotel_id(int hotel_id) throws SQLException {
        return hotelDAO.selectHotelByHotel_id(hotel_id);
    }
}
