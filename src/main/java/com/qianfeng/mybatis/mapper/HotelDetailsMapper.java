package com.qianfeng.mybatis.mapper;

import com.qianfeng.pojo.HotelDetails;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.HotelRoom;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 10:27
 * @Description:    酒店详情数据访问层
 */
public interface HotelDetailsMapper {
    /**
     *
     * 功能描述: 查询所有酒店详情
     *
     * @param: 
     * @return: 返回所有酒店详情List集合
     * @auther: werson
     * @date:  
     */
    @Select("select * from tb_hotelinfo")
    List<HotelDetails> selectAllHotelDetails() throws SQLException;

    /**
     *
     * 功能描述: 通过酒店id查询酒店详情
     *
     * @param: hotel_id:酒店id
     * @return: HotelDetails:酒店详情类
     * @auther: werson
     * @date:  
     */
    @Select("select * from tb_hotelinfo where hotel_id=#{hotel_id}")
    HotelDetails selectHotelDetailsByHotel_id(int hotel_id) throws SQLException;

    /**
     *
     * 功能描述:查询所有酒店套餐
     *
     * @param:
     * @return: 返回酒店套餐集合
     * @auther: werson
     * @date:
     */
    @Select("select * from tb_package")
    List<HotelPackage> selectAllHotelPackage() throws SQLException;

    /**
     *
     * 功能描述:通过酒店id查询酒店套餐
     *
     * @param: hotel_id:酒店id
     * @return: 返回酒店套餐集合对象，一个酒店对应多个酒店套餐
     * @auther:
     * @date:
     */
    @Select("select * from tb_package where hotel_id=#{hotel_id}")
    List<HotelPackage> selectHotelPackageByHotel_id(int hotel_id) throws SQLException;

    /**
     *
     * 功能描述:查询所有的酒店房间
     *
     * @param:
     * @return: 返回酒店所有的房间集合
     * @auther: werson
     * @date:
     */
    @Select("select * from tb_room")
    List<HotelRoom> selectAllHotelRoom() throws SQLException;

    /**
     *
     * 功能描述:通过酒店id查询酒店房间
     *
     * @param:
     * @return: 返回酒店房间集合对象，一个酒店对应多个酒店房间
     * @auther: werson
     * @date:
     */
    @Select("select * from tb_room where hotel_id=#{hotel_id}")
    List<HotelRoom> selectHotelRoomByHotel_id(int hotel_id) throws SQLException;
}
