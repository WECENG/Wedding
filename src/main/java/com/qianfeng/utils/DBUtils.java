package com.qianfeng.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class DBUtils {
    @Autowired
    DataSource dataSource;
    /**
     * 执行增删改命令
     * @param sql    SQL语句
     * @param args  参数
     * @return
     */
    public  int update(String sql,Object... args){
        QueryRunner runner = new QueryRunner(dataSource);
        try {
            return runner.update(sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 查询多条记录
     * @param clazz		对象的类型
     * @param sql		SQL语句
     * @param params   参数
     * @return 对象集合
     */
    public  <T> List<T> queryList(Class clazz, String sql, Object... params){
        QueryRunner runner = new QueryRunner(dataSource);
        try {
            return (List<T>) runner.query(sql, new BeanListHandler<>(clazz),params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询一条记录
     * @param clazz		对象的类型
     * @param sql		SQL语句
     * @param params   参数
     * @return 对象
     */
    public  <T> T query(Class clazz,String sql,Object... params){
        QueryRunner runner = new QueryRunner(dataSource);
        try {
            return (T) runner.query(sql, new BeanHandler<>(clazz),params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询数量
     * @param sql
     * @param params
     * @return 数量
     */
    public  int queryCount(String sql,Object... params){
        QueryRunner runner = new QueryRunner(dataSource);
        try {
            return runner.query(sql,
                    new ResultSetHandler<Integer>(){
                        @Override
                        public Integer handle(ResultSet rs) throws SQLException {
                            //指定查询结果集中的数据
                            rs.first();
                            return rs.getInt(1);
                        }
                    }
                    , params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
