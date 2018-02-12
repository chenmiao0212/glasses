package com.chenyu.ssm.model;

/**
 * @Author: 李晨
 * @Description:实体类：车队协议
 * @Date: Created in 10:30 2018/2/1
 */
public class Vehicle_team_agreement {
    private int vta_id;//车队协议编号
    private String vta_state;//车队协议状态
    private int vt_id;//车队编号
    private String vta_name;//车队协议名称
    private String vta_start_time;//车队协议开始时间
    private String vta_end_time;//车队协议结束时间
    private String vta_detail;//车队协议明细
    private String vta_mark;//车队协议备注
    private int user_id;//操作人
    private String vta_operate_time;//车队协议操作时间

    public int getVta_id() {
        return vta_id;
    }

    public void setVta_id(int vta_id) {
        this.vta_id = vta_id;
    }

    public String getVta_state() {
        return vta_state;
    }

    public void setVta_state(String vta_state) {
        this.vta_state = vta_state;
    }

    public int getVt_id() {
        return vt_id;
    }

    public void setVt_id(int vt_id) {
        this.vt_id = vt_id;
    }

    public String getVta_name() {
        return vta_name;
    }

    public void setVta_name(String vta_name) {
        this.vta_name = vta_name;
    }

    public String getVta_start_time() {
        return vta_start_time;
    }

    public void setVta_start_time(String vta_start_time) {
        this.vta_start_time = vta_start_time;
    }

    public String getVta_end_time() {
        return vta_end_time;
    }

    public void setVta_end_time(String vta_end_time) {
        this.vta_end_time = vta_end_time;
    }

    public String getVta_detail() {
        return vta_detail;
    }

    public void setVta_detail(String vta_detail) {
        this.vta_detail = vta_detail;
    }

    public String getVta_mark() {
        return vta_mark;
    }

    public void setVta_mark(String vta_mark) {
        this.vta_mark = vta_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getVta_operate_time() {
        return vta_operate_time;
    }

    public void setVta_operate_time(String vta_operate_time) {
        this.vta_operate_time = vta_operate_time;
    }
}

