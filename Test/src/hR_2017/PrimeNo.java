package hR_2017;

import java.util.Scanner;

public class PrimeNo {
	public static void isPrime(int n){
		if(n==1 || n==0){
			System.out.println("Not prime");
			return;
		}
		int start = n/2+1;
		int count = 0;
		for(int i= 2;i<start;i++){
			if(n%i==0){
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Prime");
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int p = in.nextInt();
	        for(int a0 = 0; a0 < p; a0++){
	            int n = in.nextInt();
	            isPrime(n);
	        }	
	}

}
