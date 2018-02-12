package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Guide;

/**
 * @Author: 柯梁
 * @Description: 领队/导游 参数接受
 * @Date: Created in 14:52 2018/1/31 0031
 */
public class GuideParam extends Guide {
    private String company_name;//公司名称
    private String user_real_name;//真实姓名

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }
}
