package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.Hotel;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.services.HotelDetailsService;
import com.qianfeng.services.HotelPackageDetailsService;
import com.qianfeng.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 20:39
 * @Description:    酒店套餐详情控制器
 */
@Controller
public class HotelPackageDetailsController {
    @Autowired
    HotelPackageDetailsService hotelPackageDetailsService;

    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/hotelPackage",method = RequestMethod.GET)
    public String HotelPackageDetails(Model model, HttpServletRequest req) throws SQLException {
        int hotel_id=Integer.parseInt(req.getParameter("hotel_id"));
        Hotel hotel=hotelService.findHotelByHotel_id(hotel_id);
        model.addAttribute("hotel",hotel);
        int package_id=Integer.parseInt(req.getParameter("package_id"));
        HotelPackage hotelPackageDetails=hotelPackageDetailsService.findHotelPackageByPackage_id(package_id);
        model.addAttribute("hotelPackageDetails",hotelPackageDetails);
        //保存HotelPackage到Session对象中
        HttpSession session=req.getSession();
        session.setAttribute("hotelPackage",hotelPackageDetails);
        return "hotelPackage";
    }
}
