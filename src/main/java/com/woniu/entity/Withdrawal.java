package com.woniu.entity;

import java.util.Date;

public class Withdrawal {
    private Integer drawid;

    private String account;

    private Double drawmoney;

    private Date drawtime;

    private Integer status;

    private Integer walletid;

    public Integer getDrawid() {
        return drawid;
    }

    public void setDrawid(Integer drawid) {
        this.drawid = drawid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getDrawmoney() {
        return drawmoney;
    }

    public void setDrawmoney(Double drawmoney) {
        this.drawmoney = drawmoney;
    }

    public Date getDrawtime() {
        return drawtime;
    }

    public void setDrawtime(Date drawtime) {
        this.drawtime = drawtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWalletid() {
        return walletid;
    }

    public void setWalletid(Integer walletid) {
        this.walletid = walletid;
    }
}