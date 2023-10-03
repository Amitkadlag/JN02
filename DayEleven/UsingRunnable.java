package com.tnsif.dayeleven;

public class UsingRunnable {

	public static void main(String[] args) {
		//Using object of Implementable class
		Runnable r=new MyChildThread();
		Thread t=new Thread(r);
		
	
		//Anonymous class
		Runnable r1=new Runnable() {		
			@Override
			public void run() {
				char ch='A';
				for(int i=0;i<26;i++)
				{
					char ch1=(char) (ch+32);
					System.out.print(ch+", "+ch1);			
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					ch++;
				}				
			}
		};
		
		Thread t1=new Thread(r1);
		
		
		//Using Lambda Expression
		Runnable r2=()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("***");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		};
		
		Thread t2=new Thread(r2);
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t.start(); //1,2,3....
		t1.start(); //A, a B, b.....
		t2.start(); //***  ***.....
		try {
			t.join();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------");
	}

}
