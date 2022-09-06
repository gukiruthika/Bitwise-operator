package javaProject1.pack1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a number..");
		int n = sn.nextInt();
		if((n&1)==1) 
			System.out.print("Odd");
		else
			System.out.print("Even");

	}

}
