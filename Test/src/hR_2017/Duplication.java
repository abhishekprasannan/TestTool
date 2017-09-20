package hR_2017;

import java.util.Scanner;

public class Duplication {
	

	static String str ="0";
	static{
		for(int i=0;i<10;i++){
			String rev = "";
			char ch = '0';
			for(int j=0;j<str.length();j++){
				ch = str.charAt(j);
				if(ch == '0'){
					ch = '1';
				}
				else{
					ch = '0';
				}
				rev = rev + ch; 
			}
			str = str + rev;
		}
	}
	
	static String duplication(int x){
        // Complete this function
		return str.charAt(x)+"";
    }
	
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }

}
