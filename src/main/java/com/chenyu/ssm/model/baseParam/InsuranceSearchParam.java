package com.chenyu.ssm.model.baseParam;

/**
 * 保险查询参数
 *
 * @author
 * @create 2018-02-01 上午 11:32
 **/
public class InsuranceSearchParam extends Vo{

    private  String insurance_state;//保险状态

    private  String insurance_type;//保险类型

    private  Vo vo;

    public String getInsurance_state() {
        return insurance_state;
    }

    public void setInsurance_state(String insurance_state) {
        this.insurance_state = insurance_state;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public Vo getVo() {
        return vo;
    }

    public void setVo(Vo vo) {
        this.vo = vo;
    }
}
