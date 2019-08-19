package com.woniu.entity;

import java.util.Date;

public class Credit {
    private Integer creditid;

    private Integer amount;

    private Date credittime;

    private Integer walletid;

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getCredittime() {
        return credittime;
    }

    public void setCredittime(Date credittime) {
        this.credittime = credittime;
    }

    public Integer getWalletid() {
        return walletid;
    }

    public void setWalletid(Integer walletid) {
        this.walletid = walletid;
    }
}