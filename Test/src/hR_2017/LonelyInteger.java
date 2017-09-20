package hR_2017;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LonelyInteger {
	 
    public static int lonelyInteger(int[] a) {
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	for(int i=0;i<a.length;i++){
    		if(hm.containsKey(a[i])){
    			hm.put(a[i], hm.get(a[i])+1);
    		}
    		else{
    			hm.put(a[i], 1);
    		}
    	}
    	Set set = hm.keySet();
    	Iterator<Integer> itr = set.iterator();
    	int ret = 0;
    	while(itr.hasNext()){
    		ret = itr.next();
    		if(hm.get(ret)==1){
    			return ret;
    		}
    	}
    	return 0;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
