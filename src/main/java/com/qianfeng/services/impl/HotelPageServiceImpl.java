package com.qianfeng.services.impl;

import com.qianfeng.dao.HotelPageDAO;
import com.qianfeng.pojo.Hotel;
import com.qianfeng.pojo.Page;
import com.qianfeng.services.HotelPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class HotelPageServiceImpl implements HotelPageService {
    @Autowired
    HotelPageDAO hotelPageDAO;
    @Override
    public Page<Hotel> findHotelPage(int currentPage,int pageSize) {
        List<Hotel> hotels=hotelPageDAO.selectHotelPage(currentPage*pageSize,pageSize);
        Page<Hotel> page=new Page<>();
        try {
            int counts=hotelPageDAO.selectPageCount();
            int pageCount;
            if(counts>1){
                pageCount=(counts-1)/pageSize+1;
            }else{
                pageCount=1;
            }
            page.setData(hotels);
            page.setPageCount(pageCount);
            page.setCurrentPage(currentPage);
        }catch(SQLException e){
            e.getStackTrace();
        }
        return page;
    }
}
