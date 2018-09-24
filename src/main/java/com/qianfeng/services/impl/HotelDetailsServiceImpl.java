package com.qianfeng.services.impl;

import com.qianfeng.mybatis.mapper.HotelDetailsMapper;
import com.qianfeng.pojo.HotelDetails;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.HotelRoom;
import com.qianfeng.services.HotelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 11:01
 * @Description:
 */
@Service
public class HotelDetailsServiceImpl implements HotelDetailsService {
    @Autowired
    HotelDetailsMapper hotelDetailsDAO;

    @Override
    public List<HotelDetails> findAllHotelDetails() throws SQLException {
        return hotelDetailsDAO.selectAllHotelDetails();
    }

    @Override
    public HotelDetails findHotelDetailsByHotel_id(int hotel_id) throws SQLException {
        return hotelDetailsDAO.selectHotelDetailsByHotel_id(hotel_id);
    }

    @Override
    public List<HotelPackage> findAllHotelPackage() throws SQLException {
        return hotelDetailsDAO.selectAllHotelPackage();
    }

    @Override
    public List<HotelPackage> findHotelPackageByHotel_id(int hotel_id) throws SQLException {
        return hotelDetailsDAO.selectHotelPackageByHotel_id(hotel_id);
    }

    @Override
    public List<HotelRoom> findAllHotelRoom() throws SQLException {
        return hotelDetailsDAO.selectAllHotelRoom();
    }

    @Override
    public List<HotelRoom> findHotelRoomByHotel_id(int hotel_id) throws SQLException {
        return hotelDetailsDAO.selectHotelRoomByHotel_id(hotel_id);
    }
}
