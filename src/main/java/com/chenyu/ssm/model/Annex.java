package com.chenyu.ssm.model;

/**
 * @Author: 柯梁
 * @Description: 实体类：附件
 * @Date: Created in 14:35 2018/1/30 0030
 */
public class Annex {

    private int annex_id;//附件编号
    private int company_id;//公司编号
    private String annex_state;//附件状态
    private String annex_name;//附件名
    private String annex_path;//附件状态
    private String annex_expire_date;//附件到期时间
    private String annex_description;//附件说明
    private int user_id;//操作人
    private String annex_create_time;//录入时间

    public int getAnnex_id() {
        return annex_id;
    }

    public void setAnnex_id(int annex_id) {
        this.annex_id = annex_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getAnnex_state() {
        return annex_state;
    }

    public void setAnnex_state(String annex_state) {
        this.annex_state = annex_state;
    }

    public String getAnnex_name() {
        return annex_name;
    }

    public void setAnnex_name(String annex_name) {
        this.annex_name = annex_name;
    }

    public String getAnnex_path() {
        return annex_path;
    }

    public void setAnnex_path(String annex_path) {
        this.annex_path = annex_path;
    }

    public String getAnnex_expire_date() {
        return annex_expire_date;
    }

    public void setAnnex_expire_date(String annex_expire_date) {
        this.annex_expire_date = annex_expire_date;
    }

    public String getAnnex_description() {
        return annex_description;
    }

    public void setAnnex_description(String annex_description) {
        this.annex_description = annex_description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAnnex_create_time() {
        return annex_create_time;
    }

    public void setAnnex_create_time(String annex_create_time) {
        this.annex_create_time = annex_create_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
