package com.vis.finance.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vis.finance.pojo.Portfolio;

public class PortfolioView {

	public static List<Portfolio> getAllPortfolios(Connection con) throws SQLException {
		List<Portfolio> portfolios = new ArrayList<Portfolio>();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from portfolio");
		while (rs.next()) {
			Portfolio p = new Portfolio();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setStartDate(rs.getDate("start_date"));
			p.setCloseDate(rs.getDate("close_date"));
			portfolios.add(p);
		}
		return portfolios;
	}

}
