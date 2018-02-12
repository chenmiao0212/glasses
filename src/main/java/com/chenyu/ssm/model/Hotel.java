package com.chenyu.ssm.model;

public class Hotel {
    private int hotel_id;//酒店编号
    private String hotel_state;//酒店状态
    private String hotel_type;//酒店类型
    private String hotel_name;//酒店名称
    private String hotel_english_name;//酒店英文名
    private String hotel_code;//酒店代码
    private int region_id;//地区编号
    private String hotel_contacter;//酒店联系人
    private String hotel_address;//酒店地址
    private String hotel_contact_info;//联系人信息
    private String hotel_level;//酒店星级
    private int user_id;//操作人
    private String hotel_operate_time;//操作时间
    private int company_id;//公司Id

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_state() {
        return hotel_state;
    }

    public void setHotel_state(String hotel_state) {
        this.hotel_state = hotel_state;
    }

    public String getHotel_type() {
        return hotel_type;
    }

    public void setHotel_type(String hotel_type) {
        this.hotel_type = hotel_type;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_english_name() {
        return hotel_english_name;
    }

    public void setHotel_english_name(String hotel_english_name) {
        this.hotel_english_name = hotel_english_name;
    }

    public String getHotel_code() {
        return hotel_code;
    }

    public void setHotel_code(String hotel_code) {
        this.hotel_code = hotel_code;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getHotel_contacter() {
        return hotel_contacter;
    }

    public void setHotel_contacter(String hotel_contacter) {
        this.hotel_contacter = hotel_contacter;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public String getHotel_contact_info() {
        return hotel_contact_info;
    }

    public void setHotel_contact_info(String hotel_contact_info) {
        this.hotel_contact_info = hotel_contact_info;
    }

    public String getHotel_level() {
        return hotel_level;
    }

    public void setHotel_level(String hotel_level) {
        this.hotel_level = hotel_level;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getHotel_operate_time() {
        return hotel_operate_time;
    }

    public void setHotel_operate_time(String hotel_operate_time) {
        this.hotel_operate_time = hotel_operate_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
}
