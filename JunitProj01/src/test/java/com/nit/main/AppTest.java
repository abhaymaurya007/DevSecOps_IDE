package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AppTest {

  Arithmatic ar=new Arithmatic();
    @Test
    public void testWithPOsitivees() {
          float expected=30.0f;
          float actual=ar.sum(10.0f, 20.0f);
          assertEquals(expected,actual);
    }
    @Test
    public void testWithNegatives() {
          float expected=-30.0f;
          float actual=ar.sum(-10.0f, -20.0f);
          assertEquals(expected,actual);
    }
    @Test
    public void testWithZeros() {
          float expected=0.0f;
          float actual=ar.sum(0.0f, 0.0f);
          assertEquals(expected,actual);
    }
    @Test
   // @Disabled
    public void testWithMixedValues() {
          float expected=-10.0f;
          float actual=ar.sum(10.0f, -20.0f);
          assertEquals(expected,actual);
    }
}
