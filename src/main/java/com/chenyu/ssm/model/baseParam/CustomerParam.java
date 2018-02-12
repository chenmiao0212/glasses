package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.Customer;

/**
 * @Author: 李晨
 * @Description:
 * @Date: Created in 16:32 2018/2/2
 */
public class CustomerParam extends Customer{

    private String company_name;//公司名称

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}
