
package com.chenyu.ssm.model;

/**
 * @Author: 柯梁
 * @Description: 实体类：客户
 * @Date: Created in 10:06 2018/1/30 0030
 */
public class Customer {

    private int customer_id;//客户编号
    private String customer_state;//客户状态
    private String customer_name;//客户名称
    private int customer_order_count;//订单量
    private int company_id;//公司Id
    private String customer_apartment;//客户部门
    private String customer_position;//客户职位
    private String customer_phoneNumber;//客户手机号
    private String customer_qqNumber;//客户QQ号码
    private String customer_email;//客户邮箱
    private String customer_WeChatNumber;//客户微信
    private int customer_belongOp_id;//客户所属OP
    private String customer_remarks;//客户备注
    private String customer_create_time;//客户创建时间
    private int user_id;//创建人Id

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_state() {
        return customer_state;
    }

    public void setCustomer_state(String customer_state) {
        this.customer_state = customer_state;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomer_order_count() {
        return customer_order_count;
    }

    public void setCustomer_order_count(int customer_order_count) {
        this.customer_order_count = customer_order_count;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCustomer_apartment() {
        return customer_apartment;
    }

    public void setCustomer_apartment(String customer_apartment) {
        this.customer_apartment = customer_apartment;
    }

    public String getCustomer_position() {
        return customer_position;
    }

    public void setCustomer_position(String customer_position) {
        this.customer_position = customer_position;
    }

    public String getCustomer_phoneNumber() {
        return customer_phoneNumber;
    }

    public void setCustomer_phoneNumber(String customer_phoneNumber) {
        this.customer_phoneNumber = customer_phoneNumber;
    }

    public String getCustomer_qqNumber() {
        return customer_qqNumber;
    }

    public void setCustomer_qqNumber(String customer_qqNumber) {
        this.customer_qqNumber = customer_qqNumber;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_WeChatNumber() {
        return customer_WeChatNumber;
    }

    public void setCustomer_WeChatNumber(String customer_WeChatNumber) {
        this.customer_WeChatNumber = customer_WeChatNumber;
    }

    public int getCustomer_belongOp_id() {
        return customer_belongOp_id;
    }

    public void setCustomer_belongOp_id(int customer_belongOp_id) {
        this.customer_belongOp_id = customer_belongOp_id;
    }

    public String getCustomer_remarks() {
        return customer_remarks;
    }

    public void setCustomer_remarks(String customer_remarks) {
        this.customer_remarks = customer_remarks;
    }

    public String getCustomer_create_time() {
        return customer_create_time;
    }

    public void setCustomer_create_time(String customer_create_time) {
        this.customer_create_time = customer_create_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
