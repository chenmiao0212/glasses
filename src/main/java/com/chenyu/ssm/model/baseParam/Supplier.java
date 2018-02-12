package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Company;

/**
 * @Author: 柯梁
 * @Description: 供应商参数接受
 * @Date: Created in 11:10 2018/1/30 0030
 */
public class Supplier extends Company{

    private String user_real_name;//真实姓名

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }
}
