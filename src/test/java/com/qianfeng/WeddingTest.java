package com.qianfeng;

import com.qianfeng.pojo.User;
import com.qianfeng.springboot.SpringBootApp;
import com.qianfeng.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootApp.class)
public class WeddingTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void testC3p0() throws SQLException {
        Connection con=dataSource.getConnection();
        Assert.assertNotNull(con);
    }

    @Test
    public void testDBUtils() {
        //创建SQL执行器
        QueryRunner runner = new QueryRunner(dataSource);
        //执行增删改操作，参数1是SQL语句，参数2之后都是SQL语句中的占位符参数
        try {
            runner.update("insert into tb_user(user_tel,user_password) values(?,?)",
                    "13009998888","123456");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDBUtilsSelect() {
        //创建SQL执行器
        QueryRunner runner = new QueryRunner(dataSource);
        try {
            //查询多条数据，参数1是SQL语句，参数2是处理器的参数是实体类的类型，参数3是占位符参数
            List<User> users = (List<User>) runner.query("select * from tb_user",new BeanListHandler<>(User.class));
            for(User user : users)
                System.out.println("user--->"+user);
            //查询单挑数据
            User user = (User) runner.query("select * from tb_user where user_id=?",new BeanHandler<>(User.class),1);
            System.out.println("单挑user--->"+user);
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }


}
