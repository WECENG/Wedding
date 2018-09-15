package com.qianfeng.services;

import com.qianfeng.pojo.Hotel;

import java.sql.SQLException;
import java.util.List;

public interface HotelService {
    /**
     *
     * 功能描述:添加酒店的业务逻辑
     *
     * @param: hotel 需要添加的hotel对象
     * @return:
     * @auther: werson
     * @date:
     */
    void addHotel(Hotel hotel)throws SQLException;
    /**
     *
     * 功能描述:查询所有的hotel集合
     *
     * @param:
     * @return: List 返回所有hotel的List集合
     * @auther: werson
     * @date:
     */
    List<Hotel> findAllHotels()throws SQLException;
    /**
     *
     * 功能描述: 通过酒店id查询酒店
     *
     * @param:
     * @return: Hotel 返回单个酒店对象
     * @auther: werson
     * @date:
     */
    Hotel findHotelByHotel_id(int hotel_id)throws SQLException;
}
