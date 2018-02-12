package com.chenyu.ssm.model;

public class HotelRoom {
    private int hr_id;//房间编号
    private String hr_name;//房间名称
    private String hr_state;//房间状态
    private String hr_type;//房间类型
    private Double hr_cost_price;//房间成本
    private Double hr_market_price;//售价
    private Double hr_peer_price;//同行价
    private int hr_size;//房间大小
    private int hr_bed_count;//房间床数
    private String hr_air_condition;//房间是否有空调
    private String hr_toilet;//房间是否有厕所
    private String hr_breakfast;//房间是否有早餐
    private String hr_lunch;//房间是否有午餐
    private String hr_dinner;//房间是否有晚餐
    private int hotel_id;//酒店编号
    private int user_id;//操作人
    private String hr_operate_time;//操作时间

    public int getHr_id() {
        return hr_id;
    }

    public void setHr_id(int hr_id) {
        this.hr_id = hr_id;
    }

    public String getHr_name() {
        return hr_name;
    }

    public void setHr_name(String hr_name) {
        this.hr_name = hr_name;
    }

    public String getHr_state() {
        return hr_state;
    }

    public void setHr_state(String hr_state) {
        this.hr_state = hr_state;
    }

    public String getHr_type() {
        return hr_type;
    }

    public void setHr_type(String hr_type) {
        this.hr_type = hr_type;
    }

    public Double getHr_cost_price() {
        return hr_cost_price;
    }

    public void setHr_cost_price(Double hr_cost_price) {
        this.hr_cost_price = hr_cost_price;
    }

    public Double getHr_market_price() {
        return hr_market_price;
    }

    public void setHr_market_price(Double hr_market_price) {
        this.hr_market_price = hr_market_price;
    }

    public Double getHr_peer_price() {
        return hr_peer_price;
    }

    public void setHr_peer_price(Double hr_peer_price) {
        this.hr_peer_price = hr_peer_price;
    }

    public int getHr_size() {
        return hr_size;
    }

    public void setHr_size(int hr_size) {
        this.hr_size = hr_size;
    }

    public int getHr_bed_count() {
        return hr_bed_count;
    }

    public void setHr_bed_count(int hr_bed_count) {
        this.hr_bed_count = hr_bed_count;
    }

    public String getHr_air_condition() {
        return hr_air_condition;
    }

    public void setHr_air_condition(String hr_air_condition) {
        this.hr_air_condition = hr_air_condition;
    }

    public String getHr_toilet() {
        return hr_toilet;
    }

    public void setHr_toilet(String hr_toilet) {
        this.hr_toilet = hr_toilet;
    }

    public String getHr_breakfast() {
        return hr_breakfast;
    }

    public void setHr_breakfast(String hr_breakfast) {
        this.hr_breakfast = hr_breakfast;
    }

    public String getHr_lunch() {
        return hr_lunch;
    }

    public void setHr_lunch(String hr_lunch) {
        this.hr_lunch = hr_lunch;
    }

    public String getHr_dinner() {
        return hr_dinner;
    }

    public void setHr_dinner(String hr_dinner) {
        this.hr_dinner = hr_dinner;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getHr_operate_time() {
        return hr_operate_time;
    }

    public void setHr_operate_time(String hr_operate_time) {
        this.hr_operate_time = hr_operate_time;
    }
}
