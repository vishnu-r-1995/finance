package com.vis.finance.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "startDate", "closeDate" })
public class PortfolioFromXml {

	private int id;
	private String name;
	private java.sql.Date startDate;
	private java.sql.Date closeDate;
	
	
	public int getId() {
		return id;
	}
	
	@XmlElement(name = "id")
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	@XmlElement(name = "name")
	public void setName(String name) {
		this.name = name;
	}
	
	public java.sql.Date getStartDate() {
		return startDate;
	}
	
	@XmlElement(name = "startDate")
	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}
	
	public java.sql.Date getCloseDate() {
		return closeDate;
	}
	
	@XmlElement(name = "closeDate")
	public void setCloseDate(java.sql.Date closeDate) {
		this.closeDate = closeDate;
	}
	
}
