package com.qianfeng.services;

import com.qianfeng.pojo.HotelPackage;

import java.sql.SQLException;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 21:01
 * @Description:    酒店套餐详情业务逻辑层
 */
public interface HotelPackageDetailsService {
    /**
     *
     * 功能描述: 通过酒店套餐id查询酒店套餐详情
     *
     * @param: 酒店套餐id
     * @return: 酒店详情对象
     * @auther: werson
     * @date:
     */
    HotelPackage findHotelPackageByPackage_id(int package_id) throws SQLException;
}
