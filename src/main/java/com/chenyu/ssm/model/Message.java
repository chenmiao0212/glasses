package com.chenyu.ssm.model;

/**
 * 讯息
 * 2018-01-30
 */
public class Message {
    private int message_id;//信息编号
    private String message_state;//信息状态
    private String message_business_type;//业务类型
    private int send_user_id;//发送人
    private String message_content;//信息内容
    private String message_send_time;//信息发送时间
    private String message_recever_name;//信息接收人

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getMessage_state() {
        return message_state;
    }

    public void setMessage_state(String message_state) {
        this.message_state = message_state;
    }

    public String getMessage_business_type() {
        return message_business_type;
    }

    public void setMessage_business_type(String message_business_type) {
        this.message_business_type = message_business_type;
    }

    public int getSend_user_id() {
        return send_user_id;
    }

    public void setSend_user_id(int send_user_id) {
        this.send_user_id = send_user_id;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getMessage_send_time() {
        return message_send_time;
    }

    public void setMessage_send_time(String message_send_time) {
        this.message_send_time = message_send_time;
    }

    public String getMessage_recever_name() {
        return message_recever_name;
    }

    public void setMessage_recever_name(String message_recever_name) {
        this.message_recever_name = message_recever_name;
    }
}
