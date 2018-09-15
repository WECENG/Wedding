package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.User;
import com.qianfeng.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * 功能描述: 用户注册控制器
 *
 * @auther: werson
 * @date:  2018/09/11
 */
@Controller
public class UserRegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/doregister",method = RequestMethod.POST)
    public String doregister(RedirectAttributes model, HttpServletRequest req){
        String user_tel=req.getParameter("user_tel");
        String password=req.getParameter("password");
        String repassword=req.getParameter("repassword");
        if(userService.findUserByuser_tel(user_tel)!=null){
            model.addFlashAttribute("msg","账号已存在");
            return "redirect:/register";
        }else if(!password.equals(repassword)){
            model.addFlashAttribute("msg","两次密码不一致");
            return "redirect:/register";
        }else{
            User user=new User();
            user.setUser_tel(user_tel);
            user.setUser_password(password);
            userService.register(user);
            return "redirect:/welcome";
        }
    }

    @RequestMapping(value = "/ajaxValidate",method = RequestMethod.POST)
    public void ajaxValidate(HttpServletRequest req, HttpServletResponse resp)
                            throws IOException {
        String user_tel=req.getParameter("user_tel");
        if(userService.findUserByuser_tel(user_tel)!=null){
            resp.setCharacterEncoding("utf-8");
            resp.setContentType("application/text");
            PrintWriter out=resp.getWriter();
            out.println("电话号码已存在");
            out.close();
        }
    }
}
