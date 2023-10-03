package com.tnsif.daynine;

import java.io.*;

public class JaggedArray {

	public static void main(String[] args) {
		int a[][] = { { 12, 23, 67 }, { 56 }, { 65, 87, 89, 90, 90 }, { 12 }, { 12, 567 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}

	}

}
