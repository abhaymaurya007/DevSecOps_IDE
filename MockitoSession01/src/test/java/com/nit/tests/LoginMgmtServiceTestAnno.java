package com.nit.tests;

import static org.junit.jupiter.api.Assertions.assertFalse; 
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.nit.dao.ILoginDAO;
import com.nit.service.ILoginMGMTService;
import com.nit.service.LoginMgmtServiceimpl;

public class LoginMgmtServiceTestAnno {
	
	@InjectMocks
	private LoginMgmtServiceimpl loginService;
	@Mock
	private ILoginDAO LoginDAOMock;
    
	public LoginMgmtServiceTestAnno() {
		MockitoAnnotations.openMocks(this);
	}
	@Test
	public void testLoginWithValidCredentials() {
		Mockito.when(LoginDAOMock.authenticate("raja","rani")).thenReturn(1);
		assertTrue(loginService.login("raja","rani"));
	}
	@Test
	public void testLoginWithInValidCredentials() {
		Mockito.when(LoginDAOMock.authenticate("raja","rani")).thenReturn(0);
		assertFalse(loginService.login("raja","rani1"));
	}
	@Test
	public void testWithNoCredentials() {
		
		assertThrows(IllegalArgumentException.class,()->loginService.login("",""));
	}
	
	public void testRegisterUserWithSpy() {
		ILoginDAO logindaoSpy=Mockito.spy(ILoginDAO.class);
		ILoginMGMTService loginService=new LoginMgmtServiceimpl(logindaoSpy);
		loginService.registerUser("raja", "rani");
		loginService.registerUser("suresh", "customer");
		loginService.registerUser("Jani", "");
		Mockito.verify(logindaoSpy,Mockito.times(1)).addUser("raja","rani");
		Mockito.verify(logindaoSpy,Mockito.times(1)).addUser("Suresh","Customer");
		Mockito.verify(logindaoSpy,Mockito.times(0)).addUser("jani","");
		
		
	}

}
