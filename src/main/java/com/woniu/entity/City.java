package com.woniu.entity;

import java.io.Serializable;
import java.util.List;

public class City implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private List zones;
	private String cid;

    private String cname;

    private String pid;
    
    public List getZones() {
		return zones;
	}

	public void setZones(List zones) {
		this.zones = zones;
	}

	public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}