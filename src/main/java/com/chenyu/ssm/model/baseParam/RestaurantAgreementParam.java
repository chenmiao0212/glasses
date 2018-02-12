package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.RestaurantAgreement;

/**
 * @Author: 柯梁
 * @Description:
 * @Date: Created in 15:43 2018/2/1 0001
 */
public class RestaurantAgreementParam extends RestaurantAgreement{
    private String user_real_name;//用户真实姓名
    private String restaurant_name;//餐厅名

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }
}
