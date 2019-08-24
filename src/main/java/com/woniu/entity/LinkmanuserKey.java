package com.woniu.entity;

import java.io.Serializable;

public class LinkmanuserKey implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer linkid;

    private Integer uid;
    
    public LinkmanuserKey(Integer linkid, Integer uid) {
		this.linkid = linkid;
		this.uid = uid;
	}
    
	public LinkmanuserKey() {
	}

	public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}