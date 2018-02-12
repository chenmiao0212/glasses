package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

/**
 *
 */
public class Bulletin extends Vo{
    private int bulletin_id;//公告编号
    private String bulletin_state;//公告状态
    private String bulletin_title;//公告标题
    private int user_id;//发布人编号
    private String bulletin_content;//公告内容
    private String bulletin_publish_time;//公告发布时间
    private String bulletin_end_time;//公告到期时间

    public int getBulletin_id() {
        return bulletin_id;
    }

    public void setBulletin_id(int bulletin_id) {
        this.bulletin_id = bulletin_id;
    }

    public String getBulletin_state() {
        return bulletin_state;
    }

    public void setBulletin_state(String bulletin_state) {
        this.bulletin_state = bulletin_state;
    }

    public String getBulletin_title() {
        return bulletin_title;
    }

    public void setBulletin_title(String bulletin_title) {
        this.bulletin_title = bulletin_title;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getBulletin_content() {
        return bulletin_content;
    }

    public void setBulletin_content(String bulletin_content) {
        this.bulletin_content = bulletin_content;
    }

    public String getBulletin_publish_time() {
        return bulletin_publish_time;
    }

    public void setBulletin_publish_time(String bulletin_publish_time) {
        this.bulletin_publish_time = bulletin_publish_time;
    }

    public String getBulletin_end_time() {
        return bulletin_end_time;
    }

    public void setBulletin_end_time(String bulletin_end_time) {
        this.bulletin_end_time = bulletin_end_time;
    }

    public enum state{
        //EFFECT:有效,DELETED:已删除,EXPIRED:失效;
        EFFECT,DELETED,EXPIRED;
    }
}
