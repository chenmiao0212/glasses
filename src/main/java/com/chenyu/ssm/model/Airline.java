package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

public class Airline extends Vo{
    private int airline_id;
    private String airline_state;
    private String airline_code;
    private String airline_name;
    private String airline_contacter;
    private String airline_contact_info;
    private String airline_website;
    private int user_id;
    private String airline_operate_time;
    private int company_id;

    public int getAirline_id() {
        return airline_id;
    }

    public void setAirline_id(int airline_id) {
        this.airline_id = airline_id;
    }

    public String getAirline_state() {
        return airline_state;
    }

    public void setAirline_state(String airline_state) {
        this.airline_state = airline_state;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public void setAirline_code(String airline_code) {
        this.airline_code = airline_code;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getAirline_contacter() {
        return airline_contacter;
    }

    public void setAirline_contacter(String airline_contacter) {
        this.airline_contacter = airline_contacter;
    }

    public String getAirline_contact_info() {
        return airline_contact_info;
    }

    public void setAirline_contact_info(String airline_contact_info) {
        this.airline_contact_info = airline_contact_info;
    }

    public String getAirline_website() {
        return airline_website;
    }

    public void setAirline_website(String airline_website) {
        this.airline_website = airline_website;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAirline_operate_time() {
        return airline_operate_time;
    }

    public void setAirline_operate_time(String airline_operate_time) {
        this.airline_operate_time = airline_operate_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
