package com.woniu.entity;

import java.io.Serializable;
import java.util.List;

public class Province implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private List citys;
	private String pid;

    private String pname;
    
    public List getCitys() {
		return citys;
	}

	public void setCitys(List citys) {
		this.citys = citys;
	}

	public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}