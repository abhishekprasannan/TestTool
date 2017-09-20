package hR_2017;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for(int i=0;i<s.length();i++){
        	Character c=s.charAt(i);
//        	System.out.println("cc:"+Character.getType(c));
        	if(Character.getType(c)==1){
        		count++;
        	}
        }
        System.out.println(count);
    }

}
