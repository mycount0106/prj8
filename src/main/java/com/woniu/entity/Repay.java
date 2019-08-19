package com.woniu.entity;

import java.util.Date;

public class Repay {
    private Integer repayid;

    private Double money;

    private Date repaytime;

    private Integer productid;

    private Integer walletid;

    private Integer status;

    private Integer uid;

    public Integer getRepayid() {
        return repayid;
    }

    public void setRepayid(Integer repayid) {
        this.repayid = repayid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getRepaytime() {
        return repaytime;
    }

    public void setRepaytime(Date repaytime) {
        this.repaytime = repaytime;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getWalletid() {
        return walletid;
    }

    public void setWalletid(Integer walletid) {
        this.walletid = walletid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}