package com.chenyu.ssm.model.baseParam;

import com.chenyu.ssm.model.HotelRoom;

public class HotelRoomParam extends HotelRoom{
    private String hotel_name;//酒店名称
    private String user_real_name;//真实姓名
    private int currentPage;//当前页数
    private int pageSize;//每页数据量

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }

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
}
