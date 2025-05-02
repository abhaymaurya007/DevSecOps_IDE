package com.nit.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.nit.dao.ILoginDAO;
import com.nit.service.ILoginMGMTService;
import com.nit.service.LoginMgmtServiceimpl;

public class LoginTestWithMockito {
	
	private static ILoginMGMTService loginSrvice;
	private static ILoginDAO loginDAO;
	
	@BeforeAll
	public static void setUp() {
		loginDAO=Mockito.mock(loginDAO);
		loginSrvice=new LoginMgmtServiceimpl(loginDAO);
		
	}
	@AfterAll
	public static void clearDown() {
		loginDAO=null;
		loginSrvice=null;
	}
	@Test
	public void testLoginVAlueWithvalidCreditiantials() {
		
		Mockito.when(loginDAO.authenticate("raja", "rani")).thenReturn(1);
		assertTrue(loginSrvice.login("raja", "rani"));
	}
	@Test
	public void testLoginVAlueWithinvalidCreditiantials() {
		
		Mockito.when(loginDAO.authenticate("raja", "rani1")).thenReturn(1);
		assertFalse(loginSrvice.login("raja", "rani1"));
	}
	@Test
	public void testLoginWithNoCredentials() {
		assertThrows(IllegalArgumentException.class,()->loginSrvice.login("",""));
	}
	@Test
   public void testRegisterUserSpy() {
	   ILoginDAO logindaoSPY=Mockito.spy(ILoginDAO.class);
	   ILoginMGMTService loginService=new LoginMgmtServiceimpl(logindaoSPY);
	   loginService.registerUser("raja", "admin");
	   loginService.registerUser("suresh", "customer");
	   loginService.registerUser("jani", "");
	   Mockito.verify(logindaoSPY,Mockito.times(1)).addUser("raja","admin");
	   Mockito.verify(logindaoSPY,Mockito.times(1)).addUser("suresh","customer");
	   Mockito.verify(logindaoSPY,Mockito.times(0)).addUser("jani","");
	   
	   
   }
	

}
