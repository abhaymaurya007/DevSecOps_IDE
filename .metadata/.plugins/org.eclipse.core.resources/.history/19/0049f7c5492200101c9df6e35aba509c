package com.nit.service;

import java.sql.Date;

public class MoreOperationsService {
	
	public boolean isPallendrome(String s) {
		
		if(s==null ||s.length()==0 ||s.equals(""))
			throw new IllegalArgumentException("Invalid String");
		String s1=new StringBuilder(s).reverse().toString();
		if(s.equalsIgnoreCase(s1)) {
			return true;
		}
		else 
			return false;
	}
    
	public Date showDateByMonth(int m) {
		if(m>0 && m<13)
			return new Date(m);
		else 
			return null;
		
	}
}
