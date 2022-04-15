package com.vis.finance.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class ConnectionUtil {

	public static Connection getConnection() throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "yadaTOt3070##");
        return con;
	}
	
	public static Connection getConnectionUsingJDBCPool() throws Exception 
	{
		DataSource ds = new DataSource();
        PoolProperties p = new PoolProperties();
        p.setUrl("jdbc:mysql://localhost:3306");
        p.setDriverClassName("com.mysql.jdbc.Driver");
        p.setUsername("root");
        p.setPassword("yadaTOt3070##");
        String connectionProperties = "databaseName=world;";
        //String connectionProperties = "databaseName=world;lockTimeout=60000;";
        p.setConnectionProperties(connectionProperties);
        ds.setPoolProperties(p);
        Connection con = ds.getConnection("root", "yadaTOt3070##");
        return con;
	}
}
