package com.rk;

public class Coffee implements Tea{

	@Override
	public void making() {
		// TODO Auto-generated method stub
		System.out.println("Coffee Making Steps");
		
		System.out.println("1.take some sugur");
		System.out.println("2.take some coffee Powder");
		System.out.println("3.take some milk");
		System.out.println("for coffee making requried minimum 15 mnt");
		System.out.println("Your Coffee is ready");
	}

}
