package com.nit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nit.service.BankService;

public class AppTest {
	private static BankService bank;
	@BeforeAll
	public static void setUp() {
		System.out.println("AppTest.setUp()");
		bank=new BankService();
	}
	@BeforeEach
	public void beforeTest() {
		System.out.println("AppTest.beforeTest()");
	}
   
	@Test
	public void testCalInterestAmongWithSmallValues() {
		double expected=1200.0;
		double actual=bank.calcInterestAmount(10000, 1.0,12.0);
		//                           Delta value
		assertEquals(expected,actual,1.0f);
	}
	@Test
	public void testCalInterestAmongWithZeroNegativeValuesValues() {
		assertThrows(IllegalArgumentException.class,()->bank.calcInterestAmount(120000,-1,-20));
	
	}
	@Test
	public void testCalInterestAmongWithTimer() {
		assertTimeout(Duration.ofMillis(30015),()->bank.calcInterestAmount(100000, 2.0, 12));
	}
	@Test
	public void testCalInterestAmongWithBigValues() {
		double expected=287999.0;
		double actual=bank.calcInterestAmount(1200000, 2.0,12.0);
		//                           Delta value
		assertEquals(expected,actual,1.0f);
	}
	@BeforeEach
	public  void afterTest() {
		System.out.println("AppTest.afterTest()");
	}
	@AfterAll
	public static void tearDown() {
		System.out.println("AppTest.tearDown()");
		bank=null;
	}
	
}
