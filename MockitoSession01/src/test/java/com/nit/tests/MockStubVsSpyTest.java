package com.nit.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockStubVsSpyTest {
	
	@Test
  public void testList() {
	  
		
		@SuppressWarnings("unchecked")
		List<String> listofMock=Mockito.mock(ArrayList.class);
		@SuppressWarnings("unchecked")
		List<String> listofSpy=Mockito.spy(ArrayList.class);
		listofMock.add("table");
		Mockito.when(listofMock.size()).thenReturn(10);
		listofSpy.add("table");
		Mockito.when(listofSpy.size()).thenReturn(10);
		System.out.println(listofMock.size()+"  "+listofSpy.size());
	    	
	}
	
	
	

}
