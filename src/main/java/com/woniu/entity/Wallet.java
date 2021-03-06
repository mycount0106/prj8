package com.woniu.entity;

import java.io.Serializable;
import java.util.Date;

public class Wallet implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer walletid;

    private Double countlimit;

    private String account;

    private Double money;

    private Double canlimit;

    private Integer uid;

    private Date createtime;

    private String password;

    public Integer getWalletid() {
        return walletid;
    }

    public void setWalletid(Integer walletid) {
        this.walletid = walletid;
    }

    public Double getCountlimit() {
        return countlimit;
    }

    public void setCountlimit(Double countlimit) {
        this.countlimit = countlimit;
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

    public Double getCanlimit() {
        return canlimit;
    }

    public void setCanlimit(Double canlimit) {
        this.canlimit = canlimit;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}