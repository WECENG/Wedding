package com.qianfeng.pojo;

public class Hotel {

    private Integer hotel_id;
    private String hotel_name;
    private String hotel_tel;
    private int hotel_star;
    private String hotel_img;

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_tel() {
        return hotel_tel;
    }

    public void setHotel_tel(String hotel_tel) {
        this.hotel_tel = hotel_tel;
    }

    public int getHotel_star() {
        return hotel_star;
    }

    public void setHotel_star(int hotel_star) {
        this.hotel_star = hotel_star;
    }

    public String getHotel_img() {
        return hotel_img;
    }

    public void setHotel_img(String hotel_img) {
        this.hotel_img = hotel_img;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_tel='" + hotel_tel + '\'' +
                ", hotel_star=" + hotel_star +
                ", hotel_img='" + hotel_img + '\'' +
                '}';
    }
}
