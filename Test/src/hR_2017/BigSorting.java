package hR_2017;

import java.util.Scanner;

public class BigSorting {
	public static void main(String[] args) {/*
		
		   Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	            int unsorted_int =Integer.parseInt(unsorted[unsorted_i]);
	            if(unsorted_i>0){
	            	
		            int unsorted_int1 =Integer.parseInt(unsorted[unsorted_i-1]);
		            System.out.println(""+unsorted_int+"   "+unsorted_int1);
		            if(unsorted_int<unsorted_int1){
		            	int temp = unsorted_int;
		                unsorted_int = unsorted_int1;
		                unsorted_int1=temp;
		                unsorted[unsorted_i] = unsorted_int+"";
		                unsorted[unsorted_i-1] = unsorted_int1+"";
		            }
		            System.out.println("2"+unsorted_int+"   "+unsorted_int1);
	                
	            }
	        }
	        // your code goes here
	         for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            System.out.println("s::"+unsorted[unsorted_i]);
	           
	        }
	*/
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        long[] arr = new long[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	            arr[unsorted_i] = Long.parseLong(unsorted[unsorted_i]);
	        }
	        for(int i=0;i<n-1;i++){
	        	
	        	for(int j=i+1;j<n;j++){
	        		if(arr[i]>arr[j]){
	        			long temp = arr[i];
	        			arr[i] = arr[j];
	        			arr[j] = temp;
	        		}
	        	}
	        }
	        
	        for(int i=0;i<n;i++){
	        	System.out.println(arr[i]);
	        }
	        
	}

}
