package hR_2017;

import java.util.Scanner;

public class Factorial {
	static int prod = 0;
	
	static int factorial(int num){
		/*if(prod==0){
			prod = num;
		}
		else{
			prod = num * prod;		
		}
		num--;
		if(num <=0){
			int finalProd =prod;
			prod =0;
			return finalProd;
		}
		return factorial(num);*/
		System.out.println(num);
		if(num == 1){
			return 1;
		}
		else{
			return num * factorial(num-1);
		}
	}
	
	static int getConsecutiveOnes(int num){
		int remainder = 0;
		String binary = ""; 
		int consecutiveOne =0;
		int greatest =0;
		while(num>0){
			remainder = num%2;
			num = num/2;
			binary += remainder;
			if(remainder == 1 && binary.length()>1 && binary.charAt(binary.length()-2)=='1'){
				consecutiveOne++;
				System.out.println("consecutiveOne::"+consecutiveOne);
				if(consecutiveOne>greatest){
					greatest =consecutiveOne;
				}
			}
			else{
				consecutiveOne =0;
			}
		}
//		System.out.println("binary::"+binary);
		return ++greatest;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int result = factorial(n);
        int result = getConsecutiveOnes(n);
        System.out.println(result);
	}
}
