package com.vis.finance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        System.out.println( "Hello World!" );
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "yadaTOt3070##");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        System.out.println(rs.next());
        System.out.println(rs.getInt(1) + "  " + rs.getString(2));
    }
}
