package com.woniu.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer oid;

    private String oname;

    private Double money;

    private Integer deadline;

    private Double rate;

    private Date otime;

    private Integer walletid;

    private Integer status;

    private Double moneyonmonth;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
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

    public Double getMoneyonmonth() {
        return moneyonmonth;
    }

    public void setMoneyonmonth(Double moneyonmonth) {
        this.moneyonmonth = moneyonmonth;
    }

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", money=" + money + ", deadline=" + deadline + ", rate="
				+ rate + ", otime=" + otime + ", walletid=" + walletid + ", status=" + status + ", moneyonmonth="
				+ moneyonmonth + "]";
	}
    
}