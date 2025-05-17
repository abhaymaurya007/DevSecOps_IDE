package com.nt.main;

import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
         Arithmetic ar=new Arithmetic();
         System.out.println("result ::"+ar.sum(100, 200));
    }
}
