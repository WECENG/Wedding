package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.Hotel;
import com.qianfeng.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.List;

@Controller
public class storePageController {
    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/storePage",method = RequestMethod.GET)
    public String findHotel(Model model) throws SQLException {
        List<Hotel> hotels=hotelService.findAllHotels();
        model.addAttribute("hotels",hotels);
        return "hotel";
    }
}
