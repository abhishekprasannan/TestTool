package hR_2017;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingInversions {
	public static long countInversions(int[] arr){
			int inversions = 0;
			for(int i=0;i<arr.length;i++){
				int temp=0;
				int tempI = i;
				if( (i>=0 && i<arr.length-1) && arr[i+1]<arr[i]){
		//			System.out.println("1  arr[i+1]:::"+arr[i+1]+"  arr[i]"+arr[i]);
					temp = arr[i];
					arr[i] =arr[i+1];
					arr[i+1] = temp;
					inversions++;
		//			tempI--;
		//			System.out.println("2  arr[i+1]:::"+arr[i+1]+"  arr[i]"+arr[i]+"  tempI::"+tempI);
					while(tempI>0 && arr[tempI]>arr[temp-1]){
		//				System.out.println("3  arr[tempI]:::"+arr[tempI]+"  arr[tempI-1]"+arr[tempI-1]);
						temp = arr[tempI];
						arr[tempI] =arr[tempI-1];
						arr[tempI-1] = temp;
						inversions++;
						tempI--;
					}
				}
				
			}
		    return inversions;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
}
