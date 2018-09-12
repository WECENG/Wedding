package com.qianfeng.dao.impl;

import com.qianfeng.dao.UserDAO;
import com.qianfeng.pojo.User;
import com.qianfeng.utils.DBUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOimpl implements UserDAO {

    @Autowired
    DBUtils utils;

    @Override
    public void addUser(User user) {
        utils.update("insert into tb_user(user_tel,user_password) values(?,?)"
        ,user.getUser_tel(),user.getUser_password());
    }

    @Override
    public void updateUser(User user) {
        utils.update("update tb_user set user_tel=?,user_password=? where user_id=?",
                user.getUser_tel(),user.getUser_password(),user.getUser_id());
    }

    @Override
    public void deleteUser(int user_id) {
        utils.update("delete from tb_user where user_id=?",user_id);
    }

    @Override
    public List<User> selectAllUsers() {
        return utils.queryList(User.class,
                "select * from tb_user");
    }

    @Override
    public User selectUserById(int user_id) {
        return utils.query(User.class,
                "select * from tb_user where user_id=?",user_id);
    }

    @Override
    public User selectUserByTel(String user_tel) {
        return utils.query(User.class,
                "select * from tb_user where user_tel=?",user_tel);
    }
}
