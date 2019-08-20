package com.woniu.entity;

import java.util.Date;

public class Loan {
    private Integer loanid;

    private String account;

    private Double money;

    private Date loantime;

    private String myaccount;

    private String serial;

    private Integer walletid;

    private Integer status;

    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getLoantime() {
        return loantime;
    }

    public void setLoantime(Date loantime) {
        this.loantime = loantime;
    }

    public String getMyaccount() {
        return myaccount;
    }

    public void setMyaccount(String myaccount) {
        this.myaccount = myaccount;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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