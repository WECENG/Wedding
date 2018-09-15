package com.qianfeng.dao.impl;

import com.qianfeng.dao.HotelPageDAO;
import com.qianfeng.pojo.Hotel;
import com.qianfeng.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class HotelPageDAOimpl implements HotelPageDAO {
    @Autowired
    DataSource dataSource;
    @Autowired
    DBUtils dbUtils;

    @Override
    public List<Hotel> selectHotelPage(int currentPage, int pageSize) {
        return dbUtils.queryList(Hotel.class,"select * from tb_hotel limit ?,?",currentPage,pageSize);
    }

    @Override
    public int selectPageCount() throws SQLException{
        QueryRunner runner = new QueryRunner(dataSource);
        int rows = runner.query("select count(*) from tb_hotel",new ResultSetHandler<Integer>(){
            @Override
            public Integer handle(ResultSet rs) throws SQLException {
                rs.first();
                return rs.getInt(1);
            }

        });

        return rows;
    }
}
