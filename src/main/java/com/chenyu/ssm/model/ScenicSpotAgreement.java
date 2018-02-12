package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

public class ScenicSpotAgreement extends Vo{

    private int ssa_id;//景区协议编号
    private String ssa_name;//景区协议名称
    private String ssa_state;//景区协议状态
    private int scenic_spot_id;//景区编号
    private String ssa_start_time;//景区协议开始时间
    private String ssa_end_time;//景区协议停止时间
    private String ssa_detail;//景区协议明细
    private String ssa_mark;//景区协议备注
    private int user_id;//操作人
    private String ssa_operate_time;//操作时间

    public int getSsa_id() {
        return ssa_id;
    }

    public void setSsa_id(int ssa_id) {
        this.ssa_id = ssa_id;
    }

    public String getSsa_name() {
        return ssa_name;
    }

    public void setSsa_name(String ssa_name) {
        this.ssa_name = ssa_name;
    }

    public String getSsa_state() {
        return ssa_state;
    }

    public void setSsa_state(String ssa_state) {
        this.ssa_state = ssa_state;
    }

    public int getScenic_spot_id() {
        return scenic_spot_id;
    }

    public void setScenic_spot_id(int scenic_spot_id) {
        this.scenic_spot_id = scenic_spot_id;
    }

    public String getSsa_start_time() {
        return ssa_start_time;
    }

    public void setSsa_start_time(String ssa_start_time) {
        this.ssa_start_time = ssa_start_time;
    }

    public String getSsa_end_time() {
        return ssa_end_time;
    }

    public void setSsa_end_time(String ssa_end_time) {
        this.ssa_end_time = ssa_end_time;
    }

    public String getSsa_detail() {
        return ssa_detail;
    }

    public void setSsa_detail(String ssa_detail) {
        this.ssa_detail = ssa_detail;
    }

    public String getSsa_mark() {
        return ssa_mark;
    }

    public void setSsa_mark(String ssa_mark) {
        this.ssa_mark = ssa_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSsa_operate_time() {
        return ssa_operate_time;
    }

    public void setSsa_operate_time(String ssa_operate_time) {
        this.ssa_operate_time = ssa_operate_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
