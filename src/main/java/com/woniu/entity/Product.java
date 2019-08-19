package com.woniu.entity;

import java.util.Date;

public class Product {
    private Integer productid;

    private String productname;

    private Integer productline;

    private Double productrate;

    private Date createdate;

    private Integer status;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getProductline() {
        return productline;
    }

    public void setProductline(Integer productline) {
        this.productline = productline;
    }

    public Double getProductrate() {
        return productrate;
    }

    public void setProductrate(Double productrate) {
        this.productrate = productrate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}