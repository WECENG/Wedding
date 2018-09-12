package com.qianfeng.controller;

import com.qianfeng.pojo.User;
import com.qianfeng.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login.do")
@Controller
public class UserLoginServlet extends HttpServlet {
    @Autowired
    UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String user_tel=req.getParameter("user_tel");
        String password=req.getParameter("password");
        User user=userService.login(user_tel,password);
        if(user!=null){
            req.getRequestDispatcher("/WEB-INF/jsp/index.html").forward(req,resp);
        }else{
            resp.sendRedirect("/login.html");
        }
    }
}
