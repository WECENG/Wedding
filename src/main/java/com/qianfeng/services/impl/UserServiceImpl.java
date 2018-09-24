package com.qianfeng.services.impl;

import com.qianfeng.mybatis.mapper.UserMapper;
import com.qianfeng.pojo.User;
import com.qianfeng.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userDAO;
    @Override
    public User login(String userTel, String password) {
        User user=userDAO.selectUserByTel(userTel);
        if(user==null){
            return null;
        }else if (password.equals(user.getUser_password())){
            return user;
        }
        return null;
    }

    @Override
    public void register(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void update(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void delete(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {
        return userDAO.selectUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userDAO.selectAllUsers();
    }

    @Override
    public User findUserByuser_tel(String user_tel) {
        return userDAO.selectUserByTel(user_tel);
    }
}
