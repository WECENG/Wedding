package com.qianfeng.dao;

import com.qianfeng.pojo.HotelPackage;

import java.sql.SQLException;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 20:54
 * @Description:    酒店套餐详情数据访问层
 */
public interface HotelPackageDetailsDAO {
    /**
     *
     * 功能描述: 通过酒店套餐id查询酒店套餐详情
     *
     * @param: 酒店套餐id
     * @return: 酒店详情对象
     * @auther: werson
     * @date:
     */
    HotelPackage selectHotelPackageByPackage_id(int package_id) throws SQLException;
}
