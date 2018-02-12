package com.chenyu.ssm.model;

public class HotelAgreement {
    private int ha_id;//酒店协议编号
    private String ha_state;//酒店协议状态
    private String ha_name;//酒店协议名字
    private int hotel_id;//酒店编号
    private String ha_start_time;//酒店协议开始时间
    private String ha_end_time;//酒店协议结束时间
    private String ha_detail;//酒店协议明细
    private String ha_mark;//酒店协议备注
    private int user_id;//操作人编号
    private String ha_operate_time;//酒店协议操作时间

    public int getHa_id() {
        return ha_id;
    }

    public void setHa_id(int ha_id) {
        this.ha_id = ha_id;
    }

    public String getHa_state() {
        return ha_state;
    }

    public void setHa_state(String ha_state) {
        this.ha_state = ha_state;
    }

    public String getHa_name() {
        return ha_name;
    }

    public void setHa_name(String ha_name) {
        this.ha_name = ha_name;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHa_start_time() {
        return ha_start_time;
    }

    public void setHa_start_time(String ha_start_time) {
        this.ha_start_time = ha_start_time;
    }

    public String getHa_end_time() {
        return ha_end_time;
    }

    public void setHa_end_time(String ha_end_time) {
        this.ha_end_time = ha_end_time;
    }

    public String getHa_detail() {
        return ha_detail;
    }

    public void setHa_detail(String ha_detail) {
        this.ha_detail = ha_detail;
    }

    public String getHa_mark() {
        return ha_mark;
    }

    public void setHa_mark(String ha_mark) {
        this.ha_mark = ha_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getHa_operate_time() {
        return ha_operate_time;
    }

    public void setHa_operate_time(String ha_operate_time) {
        this.ha_operate_time = ha_operate_time;
    }
}
