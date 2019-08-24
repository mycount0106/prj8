package com.woniu.entity;

import java.io.Serializable;

public class Linkman implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer linkid;

    private String linkname;

    private String relation;

    private String phone;

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

	@Override
	public String toString() {
		return "Linkman [linkid=" + linkid + ", linkname=" + linkname + ", relation=" + relation + ", phone=" + phone
				+ "]";
	}
    
}