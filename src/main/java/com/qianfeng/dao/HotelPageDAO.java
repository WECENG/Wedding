package com.qianfeng.dao;

import com.qianfeng.pojo.Hotel;

import java.sql.SQLException;
import java.util.List;

public interface HotelPageDAO {
    /**
     *
     * 功能描述:查询单一分页的hotel集合
     *
     * @param: currentPage:当前页面  pageSize:每一页的hotel记录数量
     * @return: List 返回单一页的hotel集合
     * @auther: werson
     * @date:
     */
    List<Hotel> selectHotelPage(int currentPage, int pageSize);
    /**
     *
     * 功能描述: 获取hotel的总记录数量
     *
     * @param:
     * @return: int 返回hotel表的总记录数
     * @auther: werson
     * @date:
     */
    int selectPageCount() throws SQLException;
}
