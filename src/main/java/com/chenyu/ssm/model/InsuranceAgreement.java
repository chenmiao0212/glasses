package com.chenyu.ssm.model;

/**
 * 实体类:保险协议
 *
 * @author 李志刚
 * @create 2018-02-02 上午 10:16
 **/
public class InsuranceAgreement {
    private int ia_id;//保险协议编号
    private String ia_state;//保险协议状态
    private  String ia_name;//保险协议名称
    private  int insurance_id;//保险编号
    private  String ia_start_time;//保险协议开始时间
    private  String ia_end_time;//保险协议结束时间
    private  String ia_detail;//保险协议详情
    private  String ia_mark;//保险协议备注
    private  int user_id;//操作人
    private  String ia_operate_time;//保险协议操作时间

    public int getIa_id() {
        return ia_id;
    }

    public void setIa_id(int ia_id) {
        this.ia_id = ia_id;
    }

    public String getIa_state() {
        return ia_state;
    }

    public void setIa_state(String ia_state) {
        this.ia_state = ia_state;
    }

    public String getIa_name() {
        return ia_name;
    }

    public void setIa_name(String ia_name) {
        this.ia_name = ia_name;
    }

    public int getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(int insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getIa_start_time() {
        return ia_start_time;
    }

    public void setIa_start_time(String ia_start_time) {
        this.ia_start_time = ia_start_time;
    }

    public String getIa_end_time() {
        return ia_end_time;
    }

    public void setIa_end_time(String ia_end_time) {
        this.ia_end_time = ia_end_time;
    }

    public String getIa_detail() {
        return ia_detail;
    }

    public void setIa_detail(String ia_detail) {
        this.ia_detail = ia_detail;
    }

    public String getIa_mark() {
        return ia_mark;
    }

    public void setIa_mark(String ia_mark) {
        this.ia_mark = ia_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getIa_operate_time() {
        return ia_operate_time;
    }

    public void setIa_operate_time(String ia_operate_time) {
        this.ia_operate_time = ia_operate_time;
    }
}
