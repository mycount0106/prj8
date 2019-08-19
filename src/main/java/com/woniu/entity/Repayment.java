package com.woniu.entity;

import java.util.Date;

public class Repayment {
    private Integer repayid;

    private String repayname;

    private Double repaymoney;

    private Date repaytime;

    private Integer walletid;

    private Integer loanid;

    private String method;

    private Integer status;

    public Integer getRepayid() {
        return repayid;
    }

    public void setRepayid(Integer repayid) {
        this.repayid = repayid;
    }

    public String getRepayname() {
        return repayname;
    }

    public void setRepayname(String repayname) {
        this.repayname = repayname;
    }

    public Double getRepaymoney() {
        return repaymoney;
    }

    public void setRepaymoney(Double repaymoney) {
        this.repaymoney = repaymoney;
    }

    public Date getRepaytime() {
        return repaytime;
    }

    public void setRepaytime(Date repaytime) {
        this.repaytime = repaytime;
    }

    public Integer getWalletid() {
        return walletid;
    }

    public void setWalletid(Integer walletid) {
        this.walletid = walletid;
    }

    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}