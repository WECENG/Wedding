package com.qianfeng.mybatis.dao;

import com.qianfeng.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDAO {
    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into tb_user(user_tel,user_password) values(#{user_tel},#{user_password})")
    void addUser(User user);
    /**
     * 更新用户，以user_id为条件，更新其它字段
     * @param user
     */
    @Update("update tb_user set user_tel=#{user_tel},user_password=#{user_password} where user_id=#{user_id}")
    void updateUser(User user);
    /**
     * 删除用户
     * @param user_id
     */
    @Delete("delete from tb_user where user_id=#{user_id}")
    void deleteUser(int user_id);
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from tb_user")
    List<User> selectAllUsers();
    /**
     * 通过id查询用户
     * @param user_id
     * @return
     */
    @Select("select * from tb_user where user_id=#{user_id}")
    User selectUserById(int user_id);
    /**
     * 通过电话查询用户
     * @param user_tel
     * @return
     */
    @Select("select * from tb_user where user_tel=#{user_tel}")
    User selectUserByTel(String user_tel);
}
