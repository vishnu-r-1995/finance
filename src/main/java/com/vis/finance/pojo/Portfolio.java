package com.vis.finance.pojo;

public class Portfolio {
	private int id;
	private String name;
	private java.sql.Date startDate;
	private java.sql.Date closeDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.sql.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}
	public java.sql.Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(java.sql.Date closeDate) {
		this.closeDate = closeDate;
	}

}
