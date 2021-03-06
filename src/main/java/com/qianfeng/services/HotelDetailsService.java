package com.qianfeng.services;

import com.qianfeng.pojo.HotelDetails;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.HotelRoom;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 10:58
 * @Description:    酒店详情业务逻辑层
 */
public interface HotelDetailsService {
    /**
     *
     * 功能描述: 查询所有酒店详情
     *
     * @param:
     * @return: 返回所有酒店详情List集合
     * @auther: werson
     * @date:
     */
    List<HotelDetails> findAllHotelDetails() throws SQLException;

    /**
     *
     * 功能描述: 通过酒店id查询酒店详情
     *
     * @param: hotel_id:酒店id
     * @return: HotelDetails:酒店详情类
     * @auther: werson
     * @date:
     */
    HotelDetails findHotelDetailsByHotel_id(int hotel_id)throws SQLException;

    /**
     *
     * 功能描述:查询所有酒店套餐
     *
     * @param:
     * @return: 返回酒店套餐集合
     * @auther: werson
     * @date:
     */
    List<HotelPackage> findAllHotelPackage() throws SQLException;

    /**
     *
     * 功能描述:通过酒店id查询酒店套餐
     *
     * @param: hotel_id:酒店id
     * @return: 返回酒店套餐集合对象，一个酒店对应多个套餐
     * @auther:
     * @date:
     */
    List<HotelPackage> findHotelPackageByHotel_id(int hotel_id) throws SQLException;

    /**
     *
     * 功能描述:查询所有的酒店房间
     *
     * @param:
     * @return: 返回酒店所有的房间集合
     * @auther: werson
     * @date:
     */
    List<HotelRoom> findAllHotelRoom() throws SQLException;

    /**
     *
     * 功能描述:通过酒店id查询酒店房间
     *
     * @param:
     * @return: 返回酒店房间集合对象，一个酒店对应多个房间
     * @auther: werson
     * @date:
     */
    List<HotelRoom> findHotelRoomByHotel_id(int hotel_id) throws SQLException;
}
