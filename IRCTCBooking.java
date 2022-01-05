package com.rk;
class Train implements Runnable
{
 int avilable_seats;
 int total_seats;
 
	public Train(int avilable_seats, int total_seats) {
	super();
	this.avilable_seats = avilable_seats;
	this.total_seats = total_seats;
}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Total Seats:"+total_seats);
		System.out.println("Avilable Seats:"+avilable_seats);
		Thread t=Thread.currentThread();
		if(total_seats<avilable_seats) {
			System.out.println(t.getName()+"Sorry No seats Avilable for booking...!");
		}else {
		
		System.out.println("for "+t.getName()+avilable_seats+"booked successfully..!");
		total_seats-=avilable_seats;
		}
	}
	
}
public class IRCTCBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Train train=new Train(4, 10);
 Thread t1=new Thread(train);
 t1.setName("Pooja");
 t1.start();
 t1.setPriority(Thread.MIN_PRIORITY);
 Thread t2=new Thread(train);
 t2.setName("Riya");
 t2.start();
 Thread t3=new Thread(train);
 t3.setName("Kian");
 t3.start();
 t3.setPriority(Thread.MAX_PRIORITY);
	}

}
