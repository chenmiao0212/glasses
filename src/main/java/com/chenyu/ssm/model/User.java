package com.chenyu.ssm.model;

import io.swagger.annotations.ApiModelProperty;

/**
 *用户表
 * 2018-01-30
 */
public class User {
    @ApiModelProperty(value = "员工编号",required = false,hidden = true)
    private int user_id;//员工编号

    @ApiModelProperty(value = "员工状态",required = false,hidden = true)
    private String user_state;//状态

    @ApiModelProperty(value = "登录账号",required = true)
    private String user_name;//登录账号

    @ApiModelProperty(value = "真实姓名",required = true)
    private String user_real_name;//真实姓名

    @ApiModelProperty(value = "联系方式",required = true)
    private String user_contact_info;//联系方式

    @ApiModelProperty(value = "银行账户",required = true)
    private String user_bank_account;//银行账户

    @ApiModelProperty(value = "权限角色编号",required = true)
    private int role_id;//权限角色编号

    @ApiModelProperty(value = "入职时间",required = true)
    private String user_emtry_time;//入职时间

    @ApiModelProperty(value = "操作人",required = true)
    private String user_operator_id;//操作人

    @ApiModelProperty(value = "操作时间",required = false,hidden = true)
    private String user_operate_time;//操作时间

    @ApiModelProperty(value = "头像地址",required = true)
    private String user_avatar;//头像地址

    @ApiModelProperty(value = "这次登录时间",required = true)
    private String user_login_time_now;//这次登录时间

    @ApiModelProperty(value = "部门编号",required = true)
    private int department_id;//部门编号

    @ApiModelProperty(value = "管理部门",required = true)
    private String user_admin_department;//管理部门

    @ApiModelProperty(value = "性别",required = true)
    private String user_sex;//性别

    @ApiModelProperty(value = "身份证号",required = true)
    private String user_identity_code;//身份证号

    @ApiModelProperty(value = "电子邮箱",required = true)
    private String user_email;//电子邮箱

    @ApiModelProperty(value = "用户验证",hidden = true)
    private String user_token;

    @ApiModelProperty(value = "密码",hidden = true)
    private String user_password;





    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }

    public String getUser_contact_info() {
        return user_contact_info;
    }

    public void setUser_contact_info(String user_contact_info) {
        this.user_contact_info = user_contact_info;
    }

    public String getUser_bank_account() {
        return user_bank_account;
    }

    public void setUser_bank_account(String user_bank_account) {
        this.user_bank_account = user_bank_account;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUser_emtry_time() {
        return user_emtry_time;
    }

    public void setUser_emtry_time(String user_emtry_time) {
        this.user_emtry_time = user_emtry_time;
    }

    public String getUser_operator_id() {
        return user_operator_id;
    }

    public void setUser_operator_id(String user_operator_id) {
        this.user_operator_id = user_operator_id;
    }

    public String getUser_operate_time() {
        return user_operate_time;
    }

    public void setUser_operate_time(String user_operate_time) {
        this.user_operate_time = user_operate_time;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getUser_login_time_now() {
        return user_login_time_now;
    }

    public void setUser_login_time_now(String user_login_time_now) {
        this.user_login_time_now = user_login_time_now;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getUser_admin_department() {
        return user_admin_department;
    }

    public void setUser_admin_department(String user_admin_department) {
        this.user_admin_department = user_admin_department;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_identity_code() {
        return user_identity_code;
    }

    public void setUser_identity_code(String user_identity_code) {
        this.user_identity_code = user_identity_code;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_token() {
        return user_token;
    }

    public void setUser_token(String user_token) {
        this.user_token = user_token;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public enum UserState{
        NORMAL("正常"),
        deleted("删除");

        private String userState;

        UserState(String userState) {
            this.userState = userState;
        }

        public String getUserState() {
            return userState;
        }

        public void setUserState(String userState) {
            this.userState = userState;
        }


    }


}
