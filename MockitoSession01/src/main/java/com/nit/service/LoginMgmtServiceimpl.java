package com.nit.service;

import com.nit.dao.ILoginDAO;

public class LoginMgmtServiceimpl implements ILoginMGMTService {
     private ILoginDAO dao;
     public LoginMgmtServiceimpl(ILoginDAO dao) {
    	 
     this.dao=dao;
     }
	@Override
	public boolean login(String user, String pwd) {
		if(user.equalsIgnoreCase("")||pwd.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Invalid inputs");
		}
		int count=dao.authenticate(user, pwd);
		if(count==0) {
			return false;
		}
		else
		return true;
	}

	@Override
	public String registerUser(String user, String role) {
		if(user.equalsIgnoreCase("")||role.equalsIgnoreCase("")) {
			dao.addUser(user, role);
			return "user added";
			
		}
		else
			return "user not added";
	}

}
