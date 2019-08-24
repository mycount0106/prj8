package com.woniu.entity;

import java.util.List;

public class Role {
	private List<Tree> trees;
	public List<Tree> getTrees() {
		return trees;
	}
	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}

	private Integer rid;

    private String rname;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

	@Override
	public String toString() {
		return rname;
	}
    
}