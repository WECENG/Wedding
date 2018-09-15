package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.Cart;
import com.qianfeng.pojo.Hotel;
import com.qianfeng.pojo.HotelPackage;
import com.qianfeng.pojo.User;
import com.qianfeng.services.CartService;
import com.qianfeng.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 09:17
 * @Description: 购物车控制器
 */
@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/queryCart", method = RequestMethod.GET)
    public String queryCart(Model model, HttpServletRequest req) throws SQLException {
        int user_id = Integer.parseInt(req.getParameter("user_id"));
        List<Cart> carts = cartService.findCartByUser_id(user_id);
        model.addAttribute("carts", carts);
        return "cart";
    }

    @RequestMapping(value = "/addCart", method = RequestMethod.GET)
    public String addCart(Model model, HttpServletRequest req) throws SQLException {
        HotelPackage hotelPackage = (HotelPackage) req.getSession().getAttribute("hotelPackage");
        int user_id = (Integer)req.getSession().getAttribute("user_id_ses");
        Hotel hotel = hotelService.findHotelByHotel_id(hotelPackage.getHotel_id());
        String currentTime = req.getParameter("currentTime");
        String packageNum=req.getParameter("packageNum");
        //通过package_name也是cart_name判断该购物车是否存在，若存在只修改单个购物车的数量
        Cart cart=cartService.findCartByCart_name(hotelPackage.getPackage_name());
        if(cart!=null){
            cartService.updateCart(
                    Integer.parseInt(cart.getCart_count())+Integer.parseInt(packageNum),
                    cart.getCart_id());
        }else{
            Cart newCart = new Cart();
            newCart.setUser_id(user_id);
            newCart.setCart_time(currentTime);
            newCart.setCart_name(hotelPackage.getPackage_name());
            newCart.setCart_type(hotelPackage.getPackage_content());
            newCart.setCart_place(hotel.getHotel_tel());
            newCart.setCart_price(hotelPackage.getPackage_price());
            newCart.setCart_count(packageNum);
            newCart.setCart_img(hotelPackage.getPackage_img1());
            newCart.setCart_hotelname(hotel.getHotel_name());
            cartService.addCart(newCart);
        }
       return "redirect:/queryCart?user_id="+user_id;
    }

    @RequestMapping(value = "/clearCart", method = RequestMethod.GET)
    public String clearCart(Model model, HttpServletRequest req) throws SQLException {
        int user_id = Integer.parseInt(req.getParameter("user_id"));
        cartService.clearCart(user_id);
        return "cart";
    }

    @RequestMapping(value = "/deleteCart", method = RequestMethod.GET)
    public String deleteCart(RedirectAttributes model, HttpServletRequest req) throws SQLException {
        int cart_id = Integer.parseInt(req.getParameter("cart_id"));
        int user_id = Integer.parseInt(req.getParameter("user_id"));
        cartService.deleteCart(cart_id);
        return "redirect:/queryCart?user_id=" + user_id;
    }
}
