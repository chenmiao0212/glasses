package com.chenyu.ssm.model.baseParam;

import io.swagger.annotations.ApiModelProperty;

public class SimpleUser {

    @ApiModelProperty(value = "用户名",required = true)
    private String user_name;
    @ApiModelProperty(value = "密码",required = true)
    private String user_password;
    @ApiModelProperty(value = "状态",hidden = true)
    private String user_state;

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
