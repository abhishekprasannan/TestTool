package hR_2017;

import java.util.Scanner;

public class BubbleSort {
	
	static void sortArray(int a_i[]){
		int swaps = 0;
		for(int i=0;i<a_i.length-1;i++){
			for(int j=i+1;j<a_i.length;j++){
				if(a_i[i]>a_i[j]){
					int temp = a_i[i];
					a_i[i] = a_i[j];
					a_i[j] = temp;	
					swaps++;
				}
			}
		}
		System.out.println("Array is sorted in "+swaps+" swaps.");
		System.out.println("First Element: "+a_i[0]);
		System.out.println("Last Element: "+a_i[a_i.length-1]);
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        sortArray(a);
    }
}
