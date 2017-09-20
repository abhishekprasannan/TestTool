package hR_2017;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        long arr0 = arr[0];
        long arr1 = arr[1];
        long arr2 = arr[2];
        long arr3 = arr[3];
        long arr4 = arr[4];
        long min = arr0 + arr1 +arr2 + arr3 ;
        long max =  arr4 + arr1 +arr2 + arr3 ;
        System.out.println(min+" "+max);
    }

}
