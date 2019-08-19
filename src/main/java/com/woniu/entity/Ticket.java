package com.woniu.entity;

public class Ticket {
    private Integer ticketid;

    private String ticketname;

    private Double ticketrate;

    private Integer validdate;

    private Integer needcredit;

    public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
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

    public Integer getValiddate() {
        return validdate;
    }

    public void setValiddate(Integer validdate) {
        this.validdate = validdate;
    }

    public Integer getNeedcredit() {
        return needcredit;
    }

    public void setNeedcredit(Integer needcredit) {
        this.needcredit = needcredit;
    }
}