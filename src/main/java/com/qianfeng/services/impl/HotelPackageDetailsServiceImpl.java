package com.qianfeng.services.impl;

import com.qianfeng.mybatis.dao.HotelPackageDetailsDAO;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.services.HotelPackageDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 21:03
 * @Description:    酒店套餐详情业务逻辑层实现类
 */
@Service
public class HotelPackageDetailsServiceImpl implements HotelPackageDetailsService {
    @Autowired
    HotelPackageDetailsDAO hotelPackageDetailsDAO;
    @Override
    public HotelPackage findHotelPackageByPackage_id(int package_id) throws SQLException {
        return hotelPackageDetailsDAO.selectHotelPackageByPackage_id(package_id);
    }
}
