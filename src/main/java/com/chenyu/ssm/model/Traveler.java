package com.chenyu.ssm.model;

public class Traveler {
    private int t_id;//游客编号
    private String t_state;//状态
    private String t_name;//姓名
    private String t_english_name;//英文名
    private String t_sex;//性别
    private String t_birthday;//生日
    private String t_native_place;//籍贯
    private String t_passport_code;//护照号
    private String t_passport_issue_date;//护照签发日期
    private String t_effective_date;//护照有效期
    private String t_identity_code;//身份证号
    private String t_contact_info;//联系方式
    private String t_emergency_contact;//紧急联系人
    private String t_remarks;//备注
    private int user_id;//操作人（备注：为空则为共享）
    private String t_customer_source;//客户来源
    private String t_operate_time;//操作时间
    private String t_is_blacklist;//游客黑名单状态
    private int lo_id;//线路订单编号

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_state() {
        return t_state;
    }

    public void setT_state(String t_state) {
        this.t_state = t_state;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_english_name() {
        return t_english_name;
    }

    public void setT_english_name(String t_english_name) {
        this.t_english_name = t_english_name;
    }

    public String getT_sex() {
        return t_sex;
    }

    public void setT_sex(String t_sex) {
        this.t_sex = t_sex;
    }

    public String getT_birthday() {
        return t_birthday;
    }

    public void setT_birthday(String t_birthday) {
        this.t_birthday = t_birthday;
    }

    public String getT_native_place() {
        return t_native_place;
    }

    public void setT_native_place(String t_native_place) {
        this.t_native_place = t_native_place;
    }

    public String getT_passport_code() {
        return t_passport_code;
    }

    public void setT_passport_code(String t_passport_code) {
        this.t_passport_code = t_passport_code;
    }

    public String getT_passport_issue_date() {
        return t_passport_issue_date;
    }

    public void setT_passport_issue_date(String t_passport_issue_date) {
        this.t_passport_issue_date = t_passport_issue_date;
    }

    public String getT_effective_date() {
        return t_effective_date;
    }

    public void setT_effective_date(String t_effective_date) {
        this.t_effective_date = t_effective_date;
    }

    public String getT_identity_code() {
        return t_identity_code;
    }

    public void setT_identity_code(String t_identity_code) {
        this.t_identity_code = t_identity_code;
    }

    public String getT_contact_info() {
        return t_contact_info;
    }

    public void setT_contact_info(String t_contact_info) {
        this.t_contact_info = t_contact_info;
    }

    public String getT_emergency_contact() {
        return t_emergency_contact;
    }

    public void setT_emergency_contact(String t_emergency_contact) {
        this.t_emergency_contact = t_emergency_contact;
    }

    public String getT_remarks() {
        return t_remarks;
    }

    public void setT_remarks(String t_remarks) {
        this.t_remarks = t_remarks;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getT_customer_source() {
        return t_customer_source;
    }

    public void setT_customer_source(String t_customer_source) {
        this.t_customer_source = t_customer_source;
    }

    public String getT_operate_time() {
        return t_operate_time;
    }

    public void setT_operate_time(String t_operate_time) {
        this.t_operate_time = t_operate_time;
    }

    public String getT_is_blacklist() {
        return t_is_blacklist;
    }

    public void setT_is_blacklist(String t_is_blacklist) {
        this.t_is_blacklist = t_is_blacklist;
    }

    public int getLo_id() {
        return lo_id;
    }

    public void setLo_id(int lo_id) {
        this.lo_id = lo_id;
    }
}
