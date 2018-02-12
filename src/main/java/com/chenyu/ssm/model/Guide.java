package com.chenyu.ssm.model;

/**
 * @Author: 柯梁
 * @Description:实体类：导游
 * @Date: Created in 14:13 2018/1/31 0031
 */
public class Guide {

    private int guide_id;//领队Id
    private String guide_state;//领队状态
    private String guide_type;//领队类型
    private int guide_group_num;//带团数量
    private String guide_name;//领队姓名
    private String guide_english_name;//英文名
    private String guide_identity_code;//身份证号
    private String guide_identity_pic;//证件照地址
    private String guide_birthday;//生日
    private String guide_sex;//性别
    private String guide_passport_code;//护照号码
    private String guide_passport_issue_place;//护照签发地
    private String guide_effective_date;//护照有效期
    private String guide_bank_name;//银行名称
    private String guide_bank_account;//银行账户
    private String guide_contact_info;//联系方式
    private String guide_card_num;//领队/导游证  号
    private String guide_remarks;//备注
    private int user_id;//操作员
    private String guide_operat_time;//操作时间
    private int company_id;//公司Id

    public int getGuide_id() {
        return guide_id;
    }

    public void setGuide_id(int guide_id) {
        this.guide_id = guide_id;
    }

    public String getGuide_state() {
        return guide_state;
    }

    public void setGuide_state(String guide_state) {
        this.guide_state = guide_state;
    }

    public String getGuide_type() {
        return guide_type;
    }

    public void setGuide_type(String guide_type) {
        this.guide_type = guide_type;
    }

    public int getGuide_group_num() {
        return guide_group_num;
    }

    public void setGuide_group_num(int guide_group_num) {
        this.guide_group_num = guide_group_num;
    }

    public String getGuide_name() {
        return guide_name;
    }

    public void setGuide_name(String guide_name) {
        this.guide_name = guide_name;
    }

    public String getGuide_english_name() {
        return guide_english_name;
    }

    public void setGuide_english_name(String guide_english_name) {
        this.guide_english_name = guide_english_name;
    }

    public String getGuide_identity_code() {
        return guide_identity_code;
    }

    public void setGuide_identity_code(String guide_identity_code) {
        this.guide_identity_code = guide_identity_code;
    }

    public String getGuide_identity_pic() {
        return guide_identity_pic;
    }

    public void setGuide_identity_pic(String guide_identity_pic) {
        this.guide_identity_pic = guide_identity_pic;
    }

    public String getGuide_birthday() {
        return guide_birthday;
    }

    public void setGuide_birthday(String guide_birthday) {
        this.guide_birthday = guide_birthday;
    }

    public String getGuide_sex() {
        return guide_sex;
    }

    public void setGuide_sex(String guide_sex) {
        this.guide_sex = guide_sex;
    }

    public String getGuide_passport_code() {
        return guide_passport_code;
    }

    public void setGuide_passport_code(String guide_passport_code) {
        this.guide_passport_code = guide_passport_code;
    }

    public String getGuide_passport_issue_place() {
        return guide_passport_issue_place;
    }

    public void setGuide_passport_issue_place(String guide_passport_issue_place) {
        this.guide_passport_issue_place = guide_passport_issue_place;
    }

    public String getGuide_effective_date() {
        return guide_effective_date;
    }

    public void setGuide_effective_date(String guide_effective_date) {
        this.guide_effective_date = guide_effective_date;
    }

    public String getGuide_bank_name() {
        return guide_bank_name;
    }

    public void setGuide_bank_name(String guide_bank_name) {
        this.guide_bank_name = guide_bank_name;
    }

    public String getGuide_bank_account() {
        return guide_bank_account;
    }

    public void setGuide_bank_account(String guide_bank_account) {
        this.guide_bank_account = guide_bank_account;
    }

    public String getGuide_contact_info() {
        return guide_contact_info;
    }

    public void setGuide_contact_info(String guide_contact_info) {
        this.guide_contact_info = guide_contact_info;
    }

    public String getGuide_card_num() {
        return guide_card_num;
    }

    public void setGuide_card_num(String guide_card_num) {
        this.guide_card_num = guide_card_num;
    }

    public String getGuide_remarks() {
        return guide_remarks;
    }

    public void setGuide_remarks(String guide_remarks) {
        this.guide_remarks = guide_remarks;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getGuide_operat_time() {
        return guide_operat_time;
    }

    public void setGuide_operat_time(String guide_operat_time) {
        this.guide_operat_time = guide_operat_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }


    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
