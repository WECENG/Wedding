package com.qianfeng.services;

import com.qianfeng.pojo.Hotel;
import com.qianfeng.pojo.Page;

public interface HotelPageService {
    /**
     *
     * 功能描述:获取单一页面的hotel集合的业务逻辑
     *
     * @param: currentPage:当前页面  pageSize:单一页面的hotel记录数量
     * @return: Page 返回一个Page封装类
     * @auther: werson
     * @date:
     */
    Page<Hotel> findHotelPage(int currentPage,int pageSize);
}
