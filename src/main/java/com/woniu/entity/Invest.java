package com.woniu.entity;

import java.util.Date;

public class Invest {
    private Integer invertid;

    private String investname;

    private Double money;

    private Integer productid;

    private Date investtime;

    private Integer walletid;

    private Integer status;

    public Integer getInvertid() {
        return invertid;
    }

    public void setInvertid(Integer invertid) {
        this.invertid = invertid;
    }

    public String getInvestname() {
        return investname;
    }

    public void setInvestname(String investname) {
        this.investname = investname;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Date getInvesttime() {
        return investtime;
    }

    public void setInvesttime(Date investtime) {
        this.investtime = investtime;
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
}