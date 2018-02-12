package com.chenyu.ssm.model;

import com.chenyu.ssm.model.baseParam.Vo;

public class ReceiptTable extends Vo{
    private int rt_id;//(收款表) 收款Id
    private int rt_finance_num;//财务编号
    private String rt_receipt_type;//收款类型（eg:订单收款）
    private String rt_lreconciliation_state;//入账状态
    private String rt_arrival_time;//到账时间
    private String rt_payer;//付款方
    private String rt_description;//摘要说明
    private double rt_original_currency;//原币金额
    private int currency_id;//币种Id
    private double rt_local_currency_amount;//本币金额
    private double rt_reciprocal_amount;//实收金额
    private String rt_certificate;//凭证
    private String rt_remarks;//备注
    private int id;//订单Id(很多订单id)
    private String rt_order_type;//订单类型
    private int customer_id;//客户编号
    private int company_id;//公司编号

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getRt_id() {
        return rt_id;
    }

    public void setRt_id(int rt_id) {
        this.rt_id = rt_id;
    }

    public int getRt_finance_num() {
        return rt_finance_num;
    }

    public void setRt_finance_num(int rt_finance_num) {
        this.rt_finance_num = rt_finance_num;
    }

    public String getRt_receipt_type() {
        return rt_receipt_type;
    }

    public void setRt_receipt_type(String rt_receipt_type) {
        this.rt_receipt_type = rt_receipt_type;
    }

    public String getRt_lreconciliation_state() {
        return rt_lreconciliation_state;
    }

    public void setRt_lreconciliation_state(String rt_lreconciliation_state) {
        this.rt_lreconciliation_state = rt_lreconciliation_state;
    }

    public String getRt_arrival_time() {
        return rt_arrival_time;
    }

    public void setRt_arrival_time(String rt_arrival_time) {
        this.rt_arrival_time = rt_arrival_time;
    }

    public String getRt_payer() {
        return rt_payer;
    }

    public void setRt_payer(String rt_payer) {
        this.rt_payer = rt_payer;
    }

    public String getRt_description() {
        return rt_description;
    }

    public void setRt_description(String rt_description) {
        this.rt_description = rt_description;
    }

    public double getRt_original_currency() {
        return rt_original_currency;
    }

    public void setRt_original_currency(double rt_original_currency) {
        this.rt_original_currency = rt_original_currency;
    }

    public int getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(int currency_id) {
        this.currency_id = currency_id;
    }

    public double getRt_local_currency_amount() {
        return rt_local_currency_amount;
    }

    public void setRt_local_currency_amount(double rt_local_currency_amount) {
        this.rt_local_currency_amount = rt_local_currency_amount;
    }

    public double getRt_reciprocal_amount() {
        return rt_reciprocal_amount;
    }

    public void setRt_reciprocal_amount(double rt_reciprocal_amount) {
        this.rt_reciprocal_amount = rt_reciprocal_amount;
    }

    public String getRt_certificate() {
        return rt_certificate;
    }

    public void setRt_certificate(String rt_certificate) {
        this.rt_certificate = rt_certificate;
    }

    public String getRt_remarks() {
        return rt_remarks;
    }

    public void setRt_remarks(String rt_remarks) {
        this.rt_remarks = rt_remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRt_order_type() {
        return rt_order_type;
    }

    public void setRt_order_type(String rt_order_type) {
        this.rt_order_type = rt_order_type;
    }
}
