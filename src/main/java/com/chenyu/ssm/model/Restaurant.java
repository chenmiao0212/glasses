package com.chenyu.ssm.model;

/**
 * @Author: 柯梁
 * @Description: 实体类：餐饮
 * @Date: Created in 9:57 2018/2/1 0001
 */
public class Restaurant {

    private int restaurant_id;//餐厅编号
    private String restaurant_state;//餐厅状态
    private int region_id;//地区Id
    private String restaurant_name;//餐厅名称
    private String restaurant_address;//餐厅地点
    private String restaurant_type;//餐厅类型
    private String restaurant_eating_type;//用餐类别
    private String restaurant_contacter;//餐厅联系人
    private String restaurant_contact_info;//餐厅联系方式
    private String restaurant_description;//餐厅说明
    private int user_id;//操作人
    private String restaurant_operate_time;//餐厅录入时间
    private int company_id;//公司Id

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_state() {
        return restaurant_state;
    }

    public void setRestaurant_state(String restaurant_state) {
        this.restaurant_state = restaurant_state;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_address() {
        return restaurant_address;
    }

    public void setRestaurant_address(String restaurant_address) {
        this.restaurant_address = restaurant_address;
    }

    public String getRestaurant_type() {
        return restaurant_type;
    }

    public void setRestaurant_type(String restaurant_type) {
        this.restaurant_type = restaurant_type;
    }

    public String getRestaurant_eating_type() {
        return restaurant_eating_type;
    }

    public void setRestaurant_eating_type(String restaurant_eating_type) {
        this.restaurant_eating_type = restaurant_eating_type;
    }

    public String getRestaurant_contacter() {
        return restaurant_contacter;
    }

    public void setRestaurant_contacter(String restaurant_contacter) {
        this.restaurant_contacter = restaurant_contacter;
    }

    public String getRestaurant_contact_info() {
        return restaurant_contact_info;
    }

    public void setRestaurant_contact_info(String restaurant_contact_info) {
        this.restaurant_contact_info = restaurant_contact_info;
    }

    public String getRestaurant_description() {
        return restaurant_description;
    }

    public void setRestaurant_description(String restaurant_description) {
        this.restaurant_description = restaurant_description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getRestaurant_operate_time() {
        return restaurant_operate_time;
    }

    public void setRestaurant_operate_time(String restaurant_operate_time) {
        this.restaurant_operate_time = restaurant_operate_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public enum state{
        //OPEN:营业,DELETED:已删除,CLOSED:停业;
        OPEN,DELETED,CLOSED;
    }
}
