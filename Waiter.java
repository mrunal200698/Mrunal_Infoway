package com.rk;

public class Waiter {

	public  void getOrder(String teaName)  {
		// TODO Auto-generated method stub
		
		try {
			Class cl=Class.forName(teaName);//teaName ->Coffee
			
			Object o=cl.newInstance();//up casting->new Coffee()
			Tea oa=(Tea)o;//down casting
			
		oa.making();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
 
}
