package javaProject1.pack1;

import java.util.Scanner;

public class Binary_to_Int {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String binaryValue = sn.next();
		int len = binaryValue.length();
		int power=0,value=0;
		for(int i=(len-1); i>=0; i--){
			int x = Character.getNumericValue(binaryValue.charAt(i));
			value+=(x*Math.pow(2, power));
			power++;
		}
		System.out.print(value);
		sn.close();
	}

}
