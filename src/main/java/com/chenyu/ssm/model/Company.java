package com.chenyu.ssm.model;

/**
 * @Author: 柯梁
 * @Description:实体类：公司
 * @Date: Created in 10:30 2018/1/30 0030
 */
public class Company {

    private int company_id;//公司编号
    private String company_state;//公司状态
    private String company_name;//公司名称
    private String company_type;//公司类型
    private int company_agreement_count;//公司协议数
    private String company_settlement;//结算方式
    private String company_area_belong;//所属区域
    private String company_principal;//负责人
    private String company_principal_phone;//负责人电话
    private String company_principal_qqNumber;//负责人QQ号
    private String company_phone;//公司电话
    private String company_address;//公司地址
    private int company_credit_totalNum;//固定信用额度
    private int company_arrearsNum;//欠款总额
    private int company_credit_restNum;//剩余额度
    private String company_fax_Number;//公司传真
    private String company_taxpayer_identifier;//纳税人识别号
    private int user_id ;//操作人
    private String company_create_time;//录入时间

    private String company_data;//公司资料




    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_state() {
        return company_state;
    }

    public void setCompany_state(String company_state) {
        this.company_state = company_state;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_type() {
        return company_type;
    }

    public void setCompany_type(String company_type) {
        this.company_type = company_type;
    }

    public int getCompany_agreement_count() {
        return company_agreement_count;
    }

    public void setCompany_agreement_count(int company_agreement_count) {
        this.company_agreement_count = company_agreement_count;
    }

    public String getCompany_settlement() {
        return company_settlement;
    }

    public void setCompany_settlement(String company_settlement) {
        this.company_settlement = company_settlement;
    }

    public String getCompany_area_belong() {
        return company_area_belong;
    }

    public void setCompany_area_belong(String company_area_belong) {
        this.company_area_belong = company_area_belong;
    }

    public String getCompany_principal() {
        return company_principal;
    }

    public void setCompany_principal(String company_principal) {
        this.company_principal = company_principal;
    }

    public String getCompany_principal_phone() {
        return company_principal_phone;
    }

    public void setCompany_principal_phone(String company_principal_phone) {
        this.company_principal_phone = company_principal_phone;
    }

    public String getCompany_principal_qqNumber() {
        return company_principal_qqNumber;
    }

    public void setCompany_principal_qqNumber(String company_principal_qqNumber) {
        this.company_principal_qqNumber = company_principal_qqNumber;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public int getCompany_credit_totalNum() {
        return company_credit_totalNum;
    }

    public void setCompany_credit_totalNum(int company_credit_totalNum) {
        this.company_credit_totalNum = company_credit_totalNum;
    }

    public int getCompany_arrearsNum() {
        return company_arrearsNum;
    }

    public void setCompany_arrearsNum(int company_arrearsNum) {
        this.company_arrearsNum = company_arrearsNum;
    }

    public int getCompany_credit_restNum() {
        return company_credit_restNum;
    }

    public void setCompany_credit_restNum(int company_credit_restNum) {
        this.company_credit_restNum = company_credit_restNum;
    }

    public String getCompany_fax_Number() {
        return company_fax_Number;
    }

    public void setCompany_fax_Number(String company_fax_Number) {
        this.company_fax_Number = company_fax_Number;
    }

    public String getCompany_taxpayer_identifier() {
        return company_taxpayer_identifier;
    }

    public void setCompany_taxpayer_identifier(String company_taxpayer_identifier) {
        this.company_taxpayer_identifier = company_taxpayer_identifier;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCompany_create_time() {
        return company_create_time;
    }

    public void setCompany_create_time(String company_create_time) {
        this.company_create_time = company_create_time;
    }

    public String getCompany_data() {
        return company_data;
    }

    public void setCompany_data(String company_data) {
        this.company_data = company_data;
    }
}
