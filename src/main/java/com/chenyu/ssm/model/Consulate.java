package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;
public class Consulate extends Vo{

    private int consulate_id;//领事馆编号
    private String consulate_state;//领事馆状态
    private String consulate_name;//领事馆名称
    private String consulate_address;//领事馆地址
    private String consulate_visa_officer;//领事馆签证员
    private String consulate_visa_officer_info;//领事馆签证员联系方式
    private int user_id;//操作人
    private String consulate_operate_time;//领事馆操作时间

    public int getConsulate_id() {
        return consulate_id;
    }

    public void setConsulate_id(int consulate_id) {
        this.consulate_id = consulate_id;
    }

    public String getConsulate_state() {
        return consulate_state;
    }

    public void setConsulate_state(String consulate_state) {
        this.consulate_state = consulate_state;
    }

    public String getConsulate_name() {
        return consulate_name;
    }

    public void setConsulate_name(String consulate_name) {
        this.consulate_name = consulate_name;
    }

    public String getConsulate_address() {
        return consulate_address;
    }

    public void setConsulate_address(String consulate_address) {
        this.consulate_address = consulate_address;
    }

    public String getConsulate_visa_officer() {
        return consulate_visa_officer;
    }

    public void setConsulate_visa_officer(String consulate_visa_officer) {
        this.consulate_visa_officer = consulate_visa_officer;
    }

    public String getConsulate_visa_officer_info() {
        return consulate_visa_officer_info;
    }

    public void setConsulate_visa_officer_info(String consulate_visa_officer_info) {
        this.consulate_visa_officer_info = consulate_visa_officer_info;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getConsulate_operate_time() {
        return consulate_operate_time;
    }

    public void setConsulate_operate_time(String consulate_operate_time) {
        this.consulate_operate_time = consulate_operate_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
