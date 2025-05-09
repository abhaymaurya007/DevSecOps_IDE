package com.nit.main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class SelectTest {
    private static Logger logger =Logger.getLogger(SelectTest.class);
    public static void main(String[] args) {
    //	System.out.println("Log4j config file: " + SelectTest.class.getClassLoader().getResource("log4j.properties"));

		logger.debug("SelectTest::start of main method()");
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.debug("Driver class Succesfully Loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhay","205102");
			logger.info("Connection is established");
			if(con!=null) {
				st=con.prepareStatement("select mid,phno from Admin71");
				logger.debug("prepare statment obj is created");
				if(st!=null) {
					rs=st.executeQuery();
					logger.debug("query executed & resulset obj crated");
					
				}
				if(rs!=null) {
					while(rs.next()) {
						System.out.println(rs.getString(1)+"   "+rs.getInt(2));
						logger.warn("records are storing into resulset");
					}
				}
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			logger.error("Problem ib ResultSet of object"+e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.error("Problem in statment obj"+e.getMessage());
		}
		finally {
			try {
				rs.close();
				st.close();
				con.close();
				logger.debug("all object closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("exception genrated in closing of objects"+e.getMessage());
			}
		}
		logger.debug("main method  closed");
	}
}
