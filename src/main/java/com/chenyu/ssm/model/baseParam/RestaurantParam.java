package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Restaurant;

/**
 * @Author: 柯梁
 * @Description:
 * @Date: Created in 14:06 2018/2/1 0001
 */
public class RestaurantParam extends Restaurant {

    private String region_name;//地区名称
    private String user_real_name;//用户真实姓名
    private String company_name;//公司名

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}
