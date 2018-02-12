package com.chenyu.ssm.model;

/**
 * 实体类：保险
 *
 * @author
 * @create 2018-02-01 上午 10:22
 **/
public class Insurance {

    private int insurance_id;//保险编号
    private  String insurance_name;//保险名称
    private  String  insurance_type;//保险类型
    private  String insurance_state;//保险状态
    private  String insurance_mark;//保险备注
    private  int user_id;//操作人
    private  String insurance_operate_time;//操作时间
    private  int company_id;//保险公司
    private  double insurance_cost_price;//成本价
    private  double insurance_peer_price;//同行价
    private  double insurance_market_price;//市场价

    public int getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(int insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getInsurance_name() {
        return insurance_name;
    }

    public void setInsurance_name(String insurance_name) {
        this.insurance_name = insurance_name;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public String getInsurance_state() {
        return insurance_state;
    }

    public void setInsurance_state(String insurance_state) {
        this.insurance_state = insurance_state;
    }

    public String getInsurance_mark() {
        return insurance_mark;
    }

    public void setInsurance_mark(String insurance_mark) {
        this.insurance_mark = insurance_mark;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getInsurance_operate_time() {
        return insurance_operate_time;
    }

    public void setInsurance_operate_time(String insurance_operate_time) {
        this.insurance_operate_time = insurance_operate_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public double getInsurance_cost_price() {
        return insurance_cost_price;
    }

    public void setInsurance_cost_price(double insurance_cost_price) {
        this.insurance_cost_price = insurance_cost_price;
    }

    public double getInsurance_peer_price() {
        return insurance_peer_price;
    }

    public void setInsurance_peer_price(double insurance_peer_price) {
        this.insurance_peer_price = insurance_peer_price;
    }

    public double getInsurance_market_price() {
        return insurance_market_price;
    }

    public void setInsurance_market_price(double insurance_market_price) {
        this.insurance_market_price = insurance_market_price;
    }
}
