package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.MessageReceiver;

public class MessageReceiverParam extends MessageReceiver{
    private int currentPage;//当前页数
    private int pageSize;//每页数据
    private String message_business_type;//业务类型
    private String send_user_id;//发送人
    private String user_real_name;//发送人真实姓名
    private String message_content;//信息内容
    private String message_send_time;//信息发送时间
    private String message_recever_name;//信息接收人

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getMessage_business_type() {
        return message_business_type;
    }

    public void setMessage_business_type(String message_business_type) {
        this.message_business_type = message_business_type;
    }

    public String getSend_user_id() {
        return send_user_id;
    }

    public void setSend_user_id(String send_user_id) {
        this.send_user_id = send_user_id;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
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
