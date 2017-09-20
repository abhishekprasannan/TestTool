package hR_2017;

import java.util.Scanner;

public class ComparingTimes {
	static String timeCompare(String t1, String t2){
        // Complete this function
		String m1 = t1.substring(t1.length()-2);
		String m2 = t1.substring(t2.length()-2);
		char mc1 = t1.charAt(t1.length()-2);
		char mc2 = t2.charAt(t2.length()-2);
		if(mc1==mc2){
			int i1 = Integer.parseInt(t1.substring(0, 2));
			int i2 = Integer.parseInt(t2.substring(0, 2));
			if(i1<i2){
				return "First";
			}
			else if(i1>i2){
				return "Second";
			}
			else if(i1==i2){
				int i3 = Integer.parseInt(t1.substring(3, 5));
				int i4 = Integer.parseInt(t2.substring(3, 5));
				if(i3<i4){
					return "First";
				}
				else if(i3>i4){
					return "Second";
				}
			}
		}
		else if(mc1<mc2){
			return "First";
		}
		else if(mc1>mc2){
			return "Second";
		}
		return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String t1 = in.next();
            String t2 = in.next();
            String result = timeCompare(t1, t2);
            System.out.println(result);
        }
    }
}
