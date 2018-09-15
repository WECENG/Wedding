package com.qianfeng;

import com.qianfeng.pojo.Hotel;
import com.qianfeng.services.HotelService;
import com.qianfeng.springboot.SpringBootApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootApp.class)
public class HotelTest {
    @Autowired
    HotelService hotelService;

    @Test
    public void addHotelTest() throws SQLException {
        for(int i=0;i<20;i++){
            Hotel hotel1=new Hotel();
            hotel1.setHotel_img("20160510052266.jpg");
            hotel1.setHotel_name("逸沐影像");
            hotel1.setHotel_star(4);
            hotel1.setHotel_tel("云南");
            hotelService.addHotel(hotel1);
        }
        for(int i=0;i<20;i++){
            Hotel hotel2=new Hotel();
            hotel2.setHotel_img("20161022100789.jpg");
            hotel2.setHotel_name("香格里拉");
            hotel2.setHotel_star(3);
            hotel2.setHotel_tel("贵州");
            hotelService.addHotel(hotel2);
        }

    }
}
