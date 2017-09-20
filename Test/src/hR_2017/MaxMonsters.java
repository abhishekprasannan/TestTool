package hR_2017;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMonsters {
	 static int getMaxMonsters(int n, int hit, int t, int[] h){
	        // Complete this function
		 Arrays.sort(h);
		 int i = 0;
		 int killed = 0;
		 for(i=0;i<t;i++){
			 int diff = h[i] - hit;
			 System.out.println("diff a::"+diff);
			 
				 while(diff>0 && i<t){
					 diff = diff - hit;
					 System.out.println("diff b::"+diff);
					 t--;				 
				 }
			
				 killed++;
			 
		 }
		 return killed;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();//No. of monsters
	        int hit = in.nextInt();//max damage
	        int t = in.nextInt();//time
	        int[] h = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        int result = getMaxMonsters(n, hit, t, h);
	        System.out.println(result);
	    }
}
