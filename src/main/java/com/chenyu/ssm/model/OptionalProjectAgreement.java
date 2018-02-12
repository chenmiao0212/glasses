package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

public class OptionalProjectAgreement extends Vo{
    private int opa_id;//自费项目协议编号
    private String opa_name;//自费项目协议名称
    private String opa_state;//自费项目协议状态
    private int optional_project_id;//自费项目编号
    private String opa_start_time;//自费项目协议开始时间
    private String opa_end_time;//自费项目协议停止时间
    private String opa_detail;//自费项目协议明细
    private String opa_mark;//自费项目协议备注
    private int user_id;//操作人
    private String opa_operate_time;//操作时间

    public int getOpa_id() {
        return opa_id;
    }

    public void setOpa_id(int opa_id) {
        this.opa_id = opa_id;
    }

    public String getOpa_name() {
        return opa_name;
    }

    public void setOpa_name(String opa_name) {
        this.opa_name = opa_name;
    }

    public String getOpa_state() {
        return opa_state;
    }

    public void setOpa_state(String opa_state) {
        this.opa_state = opa_state;
    }

    public int getOptional_project_id() {
        return optional_project_id;
    }

    public void setOptional_project_id(int optional_project_id) {
        this.optional_project_id = optional_project_id;
    }

    public String getOpa_start_time() {
        return opa_start_time;
    }

    public void setOpa_start_time(String opa_start_time) {
        this.opa_start_time = opa_start_time;
    }

    public String getOpa_end_time() {
        return opa_end_time;
    }

    public void setOpa_end_time(String opa_end_time) {
        this.opa_end_time = opa_end_time;
    }

    public String getOpa_detail() {
        return opa_detail;
    }

    public void setOpa_detail(String opa_detail) {
        this.opa_detail = opa_detail;
    }

    public String getOpa_mark() {
        return opa_mark;
    }

    public void setOpa_mark(String opa_mark) {
        this.opa_mark = opa_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOpa_operate_time() {
        return opa_operate_time;
    }

    public void setOpa_operate_time(String opa_operate_time) {
        this.opa_operate_time = opa_operate_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
