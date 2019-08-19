package com.woniu.entity;

import java.util.Date;

public class Loan {
    private Integer loanid;

    private String account;

    private Double money;

    private Integer deadline;

    private Double moneyonmonth;

    private Date loantime;

    private Integer walletid;

    private Integer status;

    private Double rate;

    private Double totalmoney;

    private Double residuemoney;

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

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Double getMoneyonmonth() {
        return moneyonmonth;
    }

    public void setMoneyonmonth(Double moneyonmonth) {
        this.moneyonmonth = moneyonmonth;
    }

    public Date getLoantime() {
        return loantime;
    }

    public void setLoantime(Date loantime) {
        this.loantime = loantime;
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Double getResiduemoney() {
        return residuemoney;
    }

    public void setResiduemoney(Double residuemoney) {
        this.residuemoney = residuemoney;
    }
}