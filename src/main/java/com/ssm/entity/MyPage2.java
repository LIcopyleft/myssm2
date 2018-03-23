package com.ssm.entity;

public class MyPage2 {

	private Integer pageNum;
	
	private Integer pageSize;

	private Integer totalPage;
	
	private String queryId;
	
	private String queryName;
	
	private String queryTele;
	
	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public String getQueryTele() {
		return queryTele;
	}

	public void setQueryTele(String queryTele) {
		this.queryTele = queryTele;
	}

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryKey) {
		this.queryId = queryKey;
	}

	private Integer totalSize;
	
	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	
	
	
}
