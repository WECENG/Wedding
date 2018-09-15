package com.qianfeng.dao;

import com.qianfeng.pojo.Hotel;

import java.sql.SQLException;
import java.util.List;

public interface HotelDAO {
    /**
     *
     * 功能描述:添加hotel
     *
     * @param: 需要添加的hotel对象
     * @return:
     * @auther: werson
     * @date:
     */
    void addHotel(Hotel hotel) throws SQLException;
    /**
     *
     * 功能描述: 查询所有hotel
     *
     * @param:
     * @return: List 返回所有酒店的List集合
     * @auther: werson
     * @date:
     */
    List<Hotel> selectAllHotels()throws SQLException;
    /**
     *
     * 功能描述: 通过酒店id查询酒店
     *
     * @param:
     * @return: Hotel 返回单个酒店对象
     * @auther: werson
     * @date:
     */
    Hotel selectHotelByHotel_id(int hotel_id)throws SQLException;
}
