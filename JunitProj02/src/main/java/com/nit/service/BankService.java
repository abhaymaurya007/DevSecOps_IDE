package com.nit.service;

public class BankService {

	
	public double calcInterestAmount(double pamt,double rate,double time) {
		
		if(pamt<=0 || rate<=0 || time<=0) 
			throw new IllegalArgumentException();
			try {
				Thread.sleep(10000);
			}
			catch(Exception e) {
				e.printStackTrace();
			} 
		return pamt*rate*time/100.0f;
		
	}

}
