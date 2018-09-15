package com.qianfeng.springmvc.controller;

import com.qianfeng.pojo.User;
import com.qianfeng.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * 功能描述: 用户登录控制器
 *
 * @auther: werson
 * @date:  2018/09/11
 */
@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(RedirectAttributes model, HttpServletRequest req, HttpSession session){
        String vcode = (String) req.getSession().getAttribute("code");
        String user_vcode = req.getParameter("vcode");
        String user_tel=req.getParameter("user_tel");
        String password=req.getParameter("password");
        User user=userService.login(user_tel,password);
        //判断验证码
        if(vcode == null || !vcode.equals(user_vcode)){
            //向request存入错误信息
            model.addFlashAttribute("msg", "验证码错误");
            //跳回login.jsp
            return "redirect:/welcome";
        }
        if(user!=null){
            //Session保存登录用户的user_id
            session.setAttribute("user_id_ses",user.getUser_id());
            return "index";
        }else{
            model.addFlashAttribute("msg", "账号或密码有误");
            return "redirect:/welcome";
        }
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
