package com.nit.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.time.LocalTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.nit.service.MoreOperationsService;


public class AppTest{
     private static MoreOperationsService mos;
       @BeforeAll
      public static void Initlization(){
    	  mos=new MoreOperationsService();
    	  System.out.println("AppTest.Initlization()");
    	  
      }
       @Test
       @Tag("test")
       @DisplayName("ashoka the great")
       public void testPallindromeWithValidData() {
    	   String msg="jahaj";
    	   assertTrue(mos.isPallendrome(msg));
    	   
       }
       @Test
       @Tag("test")
       public void testPallindromeWithInValidData() {
    	   String msg="jahkj";
    	   assertFalse(mos.isPallendrome(msg));
    	   
       }
       @Test
       public void showDatebyValidMonths() {
    	   Date act=mos.showDateByMonth(1);
    	   assertNotNull(act);
       }
       @Test
       public void showDatebyInValidMonths() {
    	   Date act=mos.showDateByMonth(14);
    	   assertNull(act);
       }
       @AfterAll
       public static void teardoenonce() {
    	   System.out.println("AppTest.teardoenonce()");
    	   mos=null;
       }
       @BeforeEach
       public void m1() {
    	   System.out.println("hi");
       }
       @AfterEach
       public void m2() {
    	   System.out.println("Bye");
       }
       @Test
       public void testSingletonRuntime() {
    	   Runtime r1=Runtime.getRuntime();
    	   Runtime r2=Runtime.getRuntime();
    	   assertSame(r1,r2);
       }
       @Test 
       public void testSingletonLocalTime() {
    	   LocalTime lt1=LocalTime.now();
    	   
    	   LocalTime lt2=LocalTime.now();
    	   assertNotSame(lt1, lt2);
    	   
       }
       
}
