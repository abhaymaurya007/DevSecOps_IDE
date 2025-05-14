package com.nit.main;


import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class SelectTest {
    private static Logger logger =Logger.getLogger(SelectTest.class);
    public static void main(String[] args) {
    	System.out.println("SelectTest.main() started");
    	SelectTest s=new SelectTest();
    	s.m1();
    	System.out.println("SelectTest.main( ended)");
       
	}
    public void m2() {
    	System.out.println("SelectTest.m1()");
    }
    public void m1() {
    	System.out.println("SelectTest.m1()");
    	String s="";
    	List l=new ArrayList();
    	l.add(10);
    	l.add(20);
    	list=null;
    	list.add(40);
    	
    }
    
}
