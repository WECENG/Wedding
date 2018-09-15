package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.Hotel;
import com.qianfeng.pojo.HotelDetails;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.HotelRoom;
import com.qianfeng.services.HotelDetailsService;
import com.qianfeng.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/13/013 11:07
 * @Description:    商品详情控制器
 */
@Controller
public class HotelDetailsController {
    @Autowired
    HotelDetailsService hotelDetailsService;

    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/hotelDetails",method = RequestMethod.GET)
    public String hotelDetails(Model model, HttpServletRequest req) throws SQLException {
        int hotel_id=Integer.parseInt(req.getParameter("hotel_id"));
        Hotel hotel=hotelService.findHotelByHotel_id(hotel_id);
        model.addAttribute("hotel",hotel);
        HotelDetails hotelDetails=hotelDetailsService.findHotelDetailsByHotel_id(hotel_id);
        model.addAttribute("hotelDetails",hotelDetails);
        List<HotelPackage> hotelPackage=hotelDetailsService.findHotelPackageByHotel_id(hotel_id);
        model.addAttribute("hotelPackage",hotelPackage);
        List<HotelRoom> hotelRoom=hotelDetailsService.findHotelRoomByHotel_id(hotel_id);
        model.addAttribute("hotelRoom",hotelRoom);
        return "hotelDetails";
    }
}
