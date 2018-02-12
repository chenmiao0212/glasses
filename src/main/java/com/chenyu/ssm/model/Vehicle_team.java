package com.chenyu.ssm.model;

/**
 * @Author: 李晨
 * @Description:实体类：车队
 * @Date: Created in 10:30 2018/2/1
 */
public class Vehicle_team {
    private int vt_id;//车队编号
    private String vt_state;//车队状态
    private String vt_code;//车队代码
    private String vt_name;//车队名称
    private String vt_contacter;//车队联系人
    private String vt_contacter_info;//联系方式
    private String vt_description;//车队说明
    private int user_id;//操作人
    private String vt_operate_time;//车队操作时间
    private int company_id;//公司id

    public int getVt_id() {
        return vt_id;
    }

    public void setVt_id(int vt_id) {
        this.vt_id = vt_id;
    }

    public String getVt_state() {
        return vt_state;
    }

    public void setVt_state(String vt_state) {
        this.vt_state = vt_state;
    }

    public String getVt_code() {
        return vt_code;
    }

    public void setVt_code(String vt_code) {
        this.vt_code = vt_code;
    }

    public String getVt_name() {
        return vt_name;
    }

    public void setVt_name(String vt_name) {
        this.vt_name = vt_name;
    }

    public String getVt_contacter() {
        return vt_contacter;
    }

    public void setVt_contacter(String vt_contacter) {
        this.vt_contacter = vt_contacter;
    }

    public String getVt_contacter_info() {
        return vt_contacter_info;
    }

    public void setVt_contacter_info(String vt_contacter_info) {
        this.vt_contacter_info = vt_contacter_info;
    }

    public String getVt_description() {
        return vt_description;
    }

    public void setVt_description(String vt_description) {
        this.vt_description = vt_description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getVt_operate_time() {
        return vt_operate_time;
    }

    public void setVt_operate_time(String vt_operate_time) {
        this.vt_operate_time = vt_operate_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
}
