package com.woniu.entity;

import java.io.Serializable;

public class Zone implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String zid;

    private String zname;

    private String cid;

    public String getZid() {
        return zid;
    }

    public void setZid(String zid) {
        this.zid = zid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}