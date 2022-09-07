package javaProject1.pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Int_to_Binary {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>();
		ArrayList <Integer> ar = new ArrayList<Integer>();
		int r;
		while(n>0) {
			r=n%2;
			arr.add(r);
			n=n/2;
		}
		int l = arr.size();
		for(int i=(l-1);i>=0;i--) {
			ar.add(arr.get(i));
		}
		for(int i:ar)
			System.out.print(i);

	}

}
