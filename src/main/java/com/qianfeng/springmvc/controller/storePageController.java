package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.Hotel;
import com.qianfeng.pojo.Page;
import com.qianfeng.services.HotelPageService;
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
 *
 * 功能描述: 商品列表控制器
 *
 * @auther: werson
 * @date:  2018/09/11
 */
@Controller
public class storePageController {
    @Autowired
    HotelService hotelService;

    @Autowired
    HotelPageService hotelPageService;

    @RequestMapping(value="/hotelPage",method = RequestMethod.GET)
    public String hotelPage(Model model, HttpServletRequest req)throws SQLException{
        int currentPage=Integer.parseInt(req.getParameter("currentPage"));
        Page<Hotel> hotelPage=hotelPageService.findHotelPage(currentPage, Page.PAGE_SIZE);
        model.addAttribute("hotelPages",hotelPage);
        return  "hotel";
    }
}
