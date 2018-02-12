package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Annex;

/**
 * @Author: 柯梁
 * @Description:
 * @Date: Created in 15:32 2018/1/30 0030
 */
public class AnnexParam extends Annex {

    private String user_real_name;//真实姓名

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }
}
