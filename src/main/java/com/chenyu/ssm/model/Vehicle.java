package com.chenyu.ssm.model;

/**
 * @Author: 李晨
 * @Description:实体类：车辆
 * @Date: Created in 10:30 2018/2/1
 */
public class Vehicle {
    private int vehicle_id;//车辆编号
    private String vehicle_name;//车辆名称
    private String vehicle_type;//车辆类型
    private int vt_id;//车队编号
    private String vehicle_state;//车辆状态
    private double vehicle_market_price;//市场价
    private double vehicle_peer_price;//同行价
    private double vehicle_cost_price;//成本价
    private int vehicle_count;//车辆数

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public int getVt_id() {
        return vt_id;
    }

    public void setVt_id(int vt_id) {
        this.vt_id = vt_id;
    }

    public String getVehicle_state() {
        return vehicle_state;
    }

    public void setVehicle_state(String vehicle_state) {
        this.vehicle_state = vehicle_state;
    }

    public double getVehicle_market_price() {
        return vehicle_market_price;
    }

    public void setVehicle_market_price(double vehicle_market_price) {
        this.vehicle_market_price = vehicle_market_price;
    }

    public double getVehicle_peer_price() {
        return vehicle_peer_price;
    }

    public void setVehicle_peer_price(double vehicle_peer_price) {
        this.vehicle_peer_price = vehicle_peer_price;
    }

    public double getVehicle_cost_price() {
        return vehicle_cost_price;
    }

    public void setVehicle_cost_price(double vehicle_cost_price) {
        this.vehicle_cost_price = vehicle_cost_price;
    }

    public int getVehicle_count() {
        return vehicle_count;
    }

    public void setVehicle_count(int vehicle_count) {
        this.vehicle_count = vehicle_count;
    }
}
