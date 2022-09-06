package javaProject1.pack1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter two numbers..");
		int a = sn.nextInt();
		int b = sn.nextInt();
		System.out.println("Before swapping.."+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping.."+a+" "+b);

	}

}
