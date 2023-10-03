package com.tnsif.dayeleven;

public class ChildThreadOne extends Thread{
	public ChildThreadOne()
	{
		start();
	}
	public ChildThreadOne(String name)
	{
		setName(name);
		start();
	}
	//task of the thread
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello : "+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error");
			}
		}
	}

}
