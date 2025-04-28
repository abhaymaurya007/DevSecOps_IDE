package com.nit.service;

public interface ILoginMGMTService {
	
	public boolean login(String user,String pwd);
	public String registerUser(String user ,String role);

}
