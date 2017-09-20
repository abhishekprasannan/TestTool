package hR_2017;

import java.util.Scanner;

public class Sol {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] file = new int[n];
	        int count =0 , temp =0;
	        int finalCount =0 ;
	        for(int file_i=0; file_i < n; file_i++){
	            file[file_i] = in.nextInt();
	            if(count == 0  ){
		            temp = file[file_i];
		            finalCount++;
		            count++;
	            }
	            else{
	            	if(count<=temp){
	            		count++;
	            	}
	            	else{
	            		count = 0;
	            	}
	            }
	        }
	        System.out.println(finalCount);
	        //  Print the number of arrays defined in 'file' to STDOUT.
	    }

}
