package hR_2017;

import java.util.Scanner;

public class MaxScore {
	 static long getMaxScore(long[] a){
	        // Complete this function
		 long maxScore = 0;
		 long runningScore = 0;
		 long finalScore = 0;
		 for(int i = a.length-1;i>=0;i--){
			 maxScore = runningScore % a[i];
			 runningScore = runningScore + a[i];
			 System.out.println("maxScore::"+maxScore+"   runningScore::"+runningScore);
			 finalScore =finalScore + maxScore;
		 }
		 return finalScore;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] a = new long[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextLong();
	        }
	        long maxScore = getMaxScore(a);
	        System.out.println(maxScore);
	    }

}
