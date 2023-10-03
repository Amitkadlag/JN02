package com.tnsif.daynine;

import java.io.*;
public class MultidimensionalArray {

	public static void main(String[] args) {
		int a[][];
		int r,c;
		System.out.println("Enter no. of rows and columns ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			r=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
			a=new int[r][c];
			System.out.println("Enter Array elements\n");
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
					a[i][j]=Integer.parseInt(br.readLine());
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
					System.out.print( a[i][j]+"\t");
				System.out.println();
			}
			
			
		} catch (NumberFormatException | IOException e) {
			System.err.println("IOException caught : "+e.getMessage());
		}
		

	}

}
