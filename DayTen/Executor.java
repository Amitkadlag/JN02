package com.tnsif.dayten;

public class Executor {

	public static void main(String[] args) {
		/*
		 * System.out.println("float division 12/6 = "+WithoutTryBlock.performDivision(
		 * 12,6)); System.out.println("12/6 = "+WithoutTryBlock.division(12,6));
		 * System.out.println("float division 12/5 = "+WithoutTryBlock.performDivision(
		 * 12,5)); System.out.println("12/5 = "+WithoutTryBlock.division(12,5));
		 * System.out.println("float division 12/0 = "+WithoutTryBlock.performDivision(
		 * 12,0)); System.out.println("12/0 = "+WithoutTryBlock.division(12,0));
		 */
		/*
		 * WithTryBlock.division(12,6); WithTryBlock.division(12,0);
		 */
		/*
		 * UsingFinallyBlock.division(12,6); UsingFinallyBlock.division(12,0);
		 */
		
		Operations o=new Operations(12,0);
		o.add();
		try
		{
			o.division();			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		/*
		 * catch(InvalidAgeException e) {
		 * 
		 * }
		 */
		System.out.println("----------------------------------");
	}

}

