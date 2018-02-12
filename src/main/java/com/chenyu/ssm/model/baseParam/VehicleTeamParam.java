package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Vehicle_team;

/**
 * @Author: 李晨
 * @Description: 车队 参数接受
 * @Date: Created in 11:42 2018/2/1
 */
public class VehicleTeamParam extends Vehicle_team {

    private String user_real_name;//真实姓名

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }
}
