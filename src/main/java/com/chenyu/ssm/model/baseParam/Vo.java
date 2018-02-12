package com.chenyu.ssm.model.baseParam;

public class Vo {
    private int totalPage;//总页数
    private int totalNum;//数据总量

    private int pageSize;//每页展示量
    private int currentPage;//当前页
    public Vo(){}
    public Vo(int totalPage, int totalNum, int currentPage, int pageSize){
        this.totalNum=totalNum;
        this.totalPage=totalPage;
        this.pageSize=pageSize;
        this.currentPage=currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
