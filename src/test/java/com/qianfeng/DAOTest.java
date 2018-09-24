package com.qianfeng;

import com.qianfeng.mybatis.dao.UserDAO;
import com.qianfeng.pojo.User;
import com.qianfeng.springboot.SpringBootApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootApp.class)
public class DAOTest {
    @Autowired
    UserDAO userDAO;

    @Test
    public void testUserInsert(){
        User user=new User();
        user.setUser_password("123123");
        user.setUser_tel("135486132222");
        userDAO.addUser(user);
    }

    @Test
    public void testUserUpdate(){
        User user=new User();
        user.setUser_password("456456");
        user.setUser_tel("138563232233");
        user.setUser_id(7);
        userDAO.updateUser(user);
    }

    @Test
    public void testUserDelete(){
        userDAO.deleteUser(5);
    }

    @Test
    public void testUserListQuery(){
        List<User> userList=userDAO.selectAllUsers();
        System.out.println(userList);
    }

    @Test
    public void testUserSingleQuery(){
        User user=userDAO.selectUserById(4);
        System.out.println(user);
    }

    @Test
    public void testUserByuser_tel(){
        User user=userDAO.selectUserByTel("138563232233");
        System.out.println(user);
    }



}
