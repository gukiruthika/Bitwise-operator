package javaProject1.pack1;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int len = sn.nextInt();
		int[] ar = new int[len];
		for(int i=0;i<len;i++) 
			ar[i]=sn.nextInt();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++){
				if((ar[i]^ar[j])==0){
					for(int k=j;k<(len-1);k++) {
						ar[k]=ar[k+1];
					}
					len--;
					j--;
				}
				
			}
		}
		for(int i=0;i<len;i++) 
			System.out.print(ar[i]+" ");
		sn.close();
	}

}
