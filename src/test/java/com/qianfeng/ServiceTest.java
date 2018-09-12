package com.qianfeng;

import com.qianfeng.pojo.User;
import com.qianfeng.services.UserService;
import com.qianfeng.springboot.SpringBootApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootApp.class)
public class ServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void testLogin(){
        Assert.assertNotNull(userService.login("13524562432","546465"));
    }

    @Test
    public void testRegister(){
        User user=new User();
        user.setUser_password("123123");
        user.setUser_tel("1836425494512");
        userService.register(user);
    }
}
