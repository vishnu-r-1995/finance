package com.vis.finance.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "date" })
public class PortfolioFromXml {

}
