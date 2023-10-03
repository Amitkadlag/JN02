package com.tnsif.dayeleven;

public class ChildThread extends Thread{
	//task of the thread
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("Hello : "+Thread.currentThread());
	}

}
