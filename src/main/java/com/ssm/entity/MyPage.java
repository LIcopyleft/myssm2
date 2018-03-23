package com.ssm.entity;

public class MyPage {

	private Integer page;
	
	private Integer rows;

	public Integer getPageNum() {
		return page;
	}

	public void setPageNum(Integer pageNum) {
		this.page = pageNum;
	}

	public Integer getPageSize() {
		return rows;
	}

	public void setPageSize(Integer pageSize) {
		this.rows = pageSize;
	}
	
	
	
}
