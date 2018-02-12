package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

public class OptionalProject extends Vo{
    private int op_id;//自费项目编号
    private String op_state;//自费项目状态
    private String op_location;//自费项目地点
    private String op_name;//自费项目名称
    private double op_fee;//自费项目费用
    private String op_duration;//自费项目时长
    private String op_description;//自费项目说明
    private int user_id;//操作人
    private String op_operate_time;//操作时间

    public int getOp_id() {
        return op_id;
    }

    public void setOp_id(int op_id) {
        this.op_id = op_id;
    }

    public String getOp_state() {
        return op_state;
    }

    public void setOp_state(String op_state) {
        this.op_state = op_state;
    }

    public String getOp_location() {
        return op_location;
    }

    public void setOp_location(String op_location) {
        this.op_location = op_location;
    }

    public String getOp_name() {
        return op_name;
    }

    public void setOp_name(String op_name) {
        this.op_name = op_name;
    }

    public double getOp_fee() {
        return op_fee;
    }

    public void setOp_fee(double op_fee) {
        this.op_fee = op_fee;
    }

    public String getOp_duration() {
        return op_duration;
    }

    public void setOp_duration(String op_duration) {
        this.op_duration = op_duration;
    }

    public String getOp_description() {
        return op_description;
    }

    public void setOp_description(String op_description) {
        this.op_description = op_description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOp_operate_time() {
        return op_operate_time;
    }

    public void setOp_operate_time(String op_operate_time) {
        this.op_operate_time = op_operate_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
