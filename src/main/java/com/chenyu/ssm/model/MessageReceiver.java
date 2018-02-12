package com.chenyu.ssm.model;

public class MessageReceiver {
    private int message_receiver_id;//收件编号
    private int message_id;//对应发送邮件编号
    private int receive_user_id;//接收人编号
    private String message_reveiver_state;//收件状态
    private String read_time;//收件已读时间

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public int getReceive_user_id() {
        return receive_user_id;
    }

    public void setReceive_user_id(int receive_user_id) {
        this.receive_user_id = receive_user_id;
    }

    public int getMessage_receiver_id() {
        return message_receiver_id;
    }

    public void setMessage_receiver_id(int message_receiver_id) {
        this.message_receiver_id = message_receiver_id;
    }

    public String getMessage_reveiver_state() {
        return message_reveiver_state;
    }

    public void setMessage_reveiver_state(String message_reveiver_state) {
        this.message_reveiver_state = message_reveiver_state;
    }

    public String getRead_time() {
        return read_time;
    }

    public void setRead_time(String read_time) {
        this.read_time = read_time;
    }
}
