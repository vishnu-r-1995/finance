package com.vis.finance;

import java.util.List;

import com.vis.finance.pojo.Portfolio;
import com.vis.finance.utility.ConnectionUtil;
import com.vis.finance.view.PortfolioView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	List<Portfolio> portfolios = PortfolioView.getAllPortfolios(ConnectionUtil.getConnectionUsingJDBCPool());
    	for (Portfolio p: portfolios) {
    		if (p.getCloseDate() != null && p.getCloseDate().getYear() == 2022) {
    			System.out.println(p.getName() + " closed this year");
    		} else if (p.getStartDate() != null && p.getStartDate().getYear() == 2022) {
    			System.out.println(p.getName() + " opened this year");
    		}
    	}
        
    }
}
