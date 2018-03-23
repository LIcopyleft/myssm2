package com.ssm.entity;

import java.util.List;

public class UsersResult {
	private String flag ;
	private List list;
	private MyPage2 page;
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List getList() {
		return list;
	}
	public void setList(List resultList) {
		this.list = resultList;
	}
	public MyPage2 getPage() {
		return page;
	}
	public void setPage(MyPage2 page2) {
		this.page = page2;
	}
}
