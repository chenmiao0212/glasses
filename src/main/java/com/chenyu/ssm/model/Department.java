package com.chenyu.ssm.model;

/**
 * @Author: chenmiao
 * @Description: 实体类 部门
 * @Date: Created in 14:10 2018/1/30 0030
 */
public class Department {
    private int department_id;
    private String department_name;
    private int department_super_id;

    public Department() {
    }

    public Department(int department_id, String department_name, int department_super_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.department_super_id = department_super_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getDepartment_super_id() {
        return department_super_id;
    }

    public void setDepartment_super_id(int department_super_id) {
        this.department_super_id = department_super_id;
    }

}
