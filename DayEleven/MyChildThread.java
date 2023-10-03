//Program to define implementable class for Runnable
package com.tnsif.dayeleven;

public class MyChildThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<40;i++)
		{
			System.out.print(i+"\t");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
