package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.User;
import com.qianfeng.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

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
}
