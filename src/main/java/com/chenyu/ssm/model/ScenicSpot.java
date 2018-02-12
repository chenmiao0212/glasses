package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

public class ScenicSpot extends Vo{

    private int ss_id;//景点编号
    private String ss_state;//景点状态
    private String ss_code;//景区代码
    private String ss_type;//景区类型
    private String ss_name;//景区名称
    private String ss_contacter;//景区联系人
    private String ss_contact_info;//联系方式
    private int user_id;//操作人
    private String ss_operate_time;//操作时间
    private int region_id;//地区编号
    private String ss_address;//景区地址
    private int company_id;//公司Id

    public int getSs_id() {
        return ss_id;
    }

    public void setSs_id(int ss_id) {
        this.ss_id = ss_id;
    }

    public String getSs_state() {
        return ss_state;
    }

    public void setSs_state(String ss_state) {
        this.ss_state = ss_state;
    }

    public String getSs_code() {
        return ss_code;
    }

    public void setSs_code(String ss_code) {
        this.ss_code = ss_code;
    }

    public String getSs_type() {
        return ss_type;
    }

    public void setSs_type(String ss_type) {
        this.ss_type = ss_type;
    }

    public String getSs_name() {
        return ss_name;
    }

    public void setSs_name(String ss_name) {
        this.ss_name = ss_name;
    }

    public String getSs_contacter() {
        return ss_contacter;
    }

    public void setSs_contacter(String ss_contacter) {
        this.ss_contacter = ss_contacter;
    }

    public String getSs_contact_info() {
        return ss_contact_info;
    }

    public void setSs_contact_info(String ss_contact_info) {
        this.ss_contact_info = ss_contact_info;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSs_operate_time() {
        return ss_operate_time;
    }

    public void setSs_operate_time(String ss_operate_time) {
        this.ss_operate_time = ss_operate_time;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getSs_address() {
        return ss_address;
    }

    public void setSs_address(String ss_address) {
        this.ss_address = ss_address;
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
