package com.qianfeng.services;

import com.qianfeng.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 登录业务逻辑
     * @param userTel
     * @param password
     * @return
     */
    public User login(String userTel, String password);
    /**
     * 注册业务逻辑
     * @param user
     */
    public void register(User user);
    /**
     * 更新
     * @param user
     */
    public void update(User user);
    /**
     * 删除
     * @param id
     */
    public void delete(int id);
    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    public User findUserById(int id);
    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAllUsers();

    public User findUserByuser_tel(String user_tel);
}
