package com.woniu.entity;

import java.io.Serializable;

public class PageBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2558623808286468972L;
	private Integer offset; //从哪开始
	private Integer limit=10;	//取几条
	private Integer pageNow=1;	//当前页
	private Integer pageCount;	//总页数
	private Integer count;	//总记录数
	private Integer page= 1;	
	private Integer rows= 10;
	
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
		this.pageNow = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
		this.limit=rows;
	}
	public Integer getOffset() {
		return (pageNow-1)*limit;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}
	public Integer getPageCount() {
		return (count+limit-1)/limit;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
}
