package com.woniu.entity;

import java.util.Date;

public class Userticket {
    private Integer userticketid;

    private String ticketname;

    private Double ticketrate;

    private Date validdate;

    private Integer walletid;

    public Integer getUserticketid() {
        return userticketid;
    }

    public void setUserticketid(Integer userticketid) {
        this.userticketid = userticketid;
    }

    public String getTicketname() {
        return ticketname;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }

    public Double getTicketrate() {
        return ticketrate;
    }

    public void setTicketrate(Double ticketrate) {
        this.ticketrate = ticketrate;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Integer getWalletid() {
        return walletid;
    }

    public void setWalletid(Integer walletid) {
        this.walletid = walletid;
    }
}