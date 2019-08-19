package com.woniu.entity;

import java.util.Date;

public class Exchange {
    private Integer exchangeid;

    private Date extime;

    private Integer examount;

    private Integer ticketid;

    private Integer creditid;

    public Integer getExchangeid() {
        return exchangeid;
    }

    public void setExchangeid(Integer exchangeid) {
        this.exchangeid = exchangeid;
    }

    public Date getExtime() {
        return extime;
    }

    public void setExtime(Date extime) {
        this.extime = extime;
    }

    public Integer getExamount() {
        return examount;
    }

    public void setExamount(Integer examount) {
        this.examount = examount;
    }

    public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }
}