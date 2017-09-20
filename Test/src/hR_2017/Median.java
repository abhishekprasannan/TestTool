package hR_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Median {


    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        ArrayList<Integer> aList = new ArrayList<Integer>();
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	            aList.add(a[a_i]);
	            Collections.sort(aList);
                double median = 0;
	            if(aList.size()%2==0){
	                double f = aList.get((aList.size()/2)-1);
	                double s = aList.get(aList.size()/2);
	                median = (f+s)/2;
	                System.out.println(median);
	            }
	            else{
	            	median = (aList.size()/2)+1;
                    System.out.println(median);
	            }
	            
	        }
	    
    }
}
