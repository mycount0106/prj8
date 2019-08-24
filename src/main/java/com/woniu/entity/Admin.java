package com.woniu.entity;

import java.util.Date;
import java.util.List;

public class Admin {
	
	private List<Tree> trees;
	public List<Tree> getTrees() {
		return trees;
	}
	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}
	private List<Role> roles;
    public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	private Integer aid;

    private String aname;

    private String password;

    private Date regtime;

    private Integer isdelete;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}