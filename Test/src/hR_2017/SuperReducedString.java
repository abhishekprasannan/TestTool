package hR_2017;

import java.util.Scanner;

public class SuperReducedString {
	static String super_reduced_string(String s){
        // Complete this function
		String newStr="";
		for(int i=0;i<s.length();i++){
			System.out.println("o::"+s.charAt(i)+"  i::"+i);
			if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
//				System.out.println("i 1::"+s.charAt(i)+"  i::"+i);
				i++;
			}
			else if(newStr.length()!=0 && s.charAt(i)==newStr.charAt(newStr.length()-1)){
				newStr = newStr.substring(0, newStr.length()-1);
//				System.out.println("i 2::"+s.charAt(i)+"  i::"+i);
//				i++;
			}
			else{
				newStr += s.charAt(i);
			}
		}
		if(newStr.equals("")){
			newStr = "Empty String";
		}
		return newStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }

}
