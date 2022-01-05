package com.rk;

import java.util.Scanner;

public class HotelRK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome To RK Tea Center");
		Scanner sn =new Scanner(System.in);
		System.out.println("\n1.BlackTea\n2.MilkTea\n3.Coffee");
		System.out.println("___________________________________");
		System.out.println("Please Enter your Order(Tea)");
		String teaName=sn.next();
		Waiter sham=new Waiter();
		sham.getOrder(teaName);
		
	}
}