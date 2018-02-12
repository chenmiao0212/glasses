package com.chenyu.ssm.model;

/**
 * @Author: 柯梁
 * @Description: 实体类：餐厅协议
 * @Date: Created in 10:11 2018/2/1 0001
 */
public class RestaurantAgreement {

    private int ra_id;
    private String ra_state;
    private String ra_name;
    private int restaurant_id;
    private String ra_start_time;
    private String ra_end_time;
    private String ra_detail;
    private String ra_mark;
    private int user_id;
    private String ra_operate_time;

    public int getRa_id() {
        return ra_id;
    }

    public void setRa_id(int ra_id) {
        this.ra_id = ra_id;
    }

    public String getRa_state() {
        return ra_state;
    }

    public void setRa_state(String ra_state) {
        this.ra_state = ra_state;
    }

    public String getRa_name() {
        return ra_name;
    }

    public void setRa_name(String ra_name) {
        this.ra_name = ra_name;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRa_start_time() {
        return ra_start_time;
    }

    public void setRa_start_time(String ra_start_time) {
        this.ra_start_time = ra_start_time;
    }

    public String getRa_end_time() {
        return ra_end_time;
    }

    public void setRa_end_time(String ra_end_time) {
        this.ra_end_time = ra_end_time;
    }

    public String getRa_detail() {
        return ra_detail;
    }

    public void setRa_detail(String ra_detail) {
        this.ra_detail = ra_detail;
    }

    public String getRa_mark() {
        return ra_mark;
    }

    public void setRa_mark(String ra_mark) {
        this.ra_mark = ra_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getRa_operate_time() {
        return ra_operate_time;
    }

    public void setRa_operate_time(String ra_operate_time) {
        this.ra_operate_time = ra_operate_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
