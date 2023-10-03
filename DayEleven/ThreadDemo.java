package com.tnsif.dayeleven;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("------------In main()------------");
		System.out.println(Thread.currentThread());
		ChildThread t1=new ChildThread();
		ChildThread t2=new ChildThread();
		t1.start();		
		//t1.start(); IllegalThreadStateExecption
		t2.start();		
		
		/* not following multithreaded approach - single thread application
		 * t1.run(); t2.run();
		 */
		
		System.out.println("-----------End of main()---------");		
	}

}
