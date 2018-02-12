package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Vehicle_team_agreement;

/**
 * @Author: 李晨
 * @Description: 车队协议 参数接受
 * @Date: Created in 15:33 2018/2/1
 */
public class VehicleTeamAgreementParam extends Vehicle_team_agreement {

    private String user_real_name;//真实姓名
    private String vt_name;//车队名称

    public String getVt_name() {
        return vt_name;
    }

    public void setVt_name(String vt_name) {
        this.vt_name = vt_name;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }
}
