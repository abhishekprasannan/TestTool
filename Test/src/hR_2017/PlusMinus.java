package hR_2017;

import java.util.Scanner;

public class PlusMinus {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        double pCount = 0;
	        double nCount = 0;
	        double zCount = 0;
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            if(arr[arr_i] <0){
	            	nCount++;
	            }
	            else if(arr[arr_i] >0){
	            	pCount++;
	            }
	            else{
	            	zCount++;
	            }
	        }
//	        double pdCount= pCount/n;
	        System.out.println(pCount/n);
	        System.out.println(nCount/n);
	        System.out.println(zCount/n);
	    }

}
