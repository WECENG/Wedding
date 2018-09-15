package com.qianfeng.pojo;

/**
 * @Auther: werson
 * @Date: 2018/9/14/014 14:09
 * @Description:    购物车Bean
 */
public class Cart {
    private Integer cart_id;
    private Integer user_id;
    private String cart_time;
    private String cart_name;
    private String cart_type;
    private String cart_place;
    private String cart_price;
    private String cart_count;
    private String cart_img;
    private String cart_hotelname;

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCart_time() {
        return cart_time;
    }

    public void setCart_time(String cart_time) {
        this.cart_time = cart_time;
    }

    public String getCart_name() {
        return cart_name;
    }

    public void setCart_name(String cart_name) {
        this.cart_name = cart_name;
    }

    public String getCart_type() {
        return cart_type;
    }

    public void setCart_type(String cart_type) {
        this.cart_type = cart_type;
    }

    public String getCart_place() {
        return cart_place;
    }

    public void setCart_place(String cart_place) {
        this.cart_place = cart_place;
    }

    public String getCart_price() {
        return cart_price;
    }

    public void setCart_price(String cart_price) {
        this.cart_price = cart_price;
    }

    public String getCart_count() {
        return cart_count;
    }

    public void setCart_count(String cart_count) {
        this.cart_count = cart_count;
    }

    public String getCart_img() {
        return cart_img;
    }

    public void setCart_img(String cart_img) {
        this.cart_img = cart_img;
    }

    public String getCart_hotelname() {
        return cart_hotelname;
    }

    public void setCart_hotelname(String cart_hotelname) {
        this.cart_hotelname = cart_hotelname;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", user_id=" + user_id +
                ", cart_time='" + cart_time + '\'' +
                ", cart_name='" + cart_name + '\'' +
                ", cart_type='" + cart_type + '\'' +
                ", cart_place='" + cart_place + '\'' +
                ", cart_price='" + cart_price + '\'' +
                ", cart_count='" + cart_count + '\'' +
                ", cart_img='" + cart_img + '\'' +
                ", cart_hotelname='" + cart_hotelname + '\'' +
                '}';
    }
}
