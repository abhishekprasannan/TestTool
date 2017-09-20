package hR_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Solutions {
	void alt() {
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int numQueries = Integer.parseInt(br.readLine());
	    HashMap<String, Integer> map = new HashMap<String, Integer>();

	    for (int i = 0; i < numQueries; i++){
	        String[] data = br.readLine().split(" ");

	        if (data[0].equals("add")){
	            for (int j = 1; j <= data[1].length(); j++){
	                String sub = data[1].substring(0, j);
	                if (map.get(sub) == null){
	                    map.put(sub, 1);
	                } else {
	                    map.put(sub, map.get(sub) + 1);
	                }
	            }
	        } else { //query matches
	            if (map.get(data[1]) == null){
	                System.out.println(0);
	            } else {
	                System.out.println(map.get(data[1]));
	            }

	        }
	    }
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	    System.exit(0);

	}

    public static void main(String[] args) {
//    	new Solutions().alt();
    	/*===================using arrays
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
//			ArrayList<String> contactList = new ArrayList<String>(n);
	        String [] contactList = new String[n];
	        int listIndex= 0;
	        if((n <= 100000) && (n >=1)){
		        for(int a0 = 0; a0 < n; a0++){
		            String op = in.next();
		            String contact = in.next();
		            if("add".equals(op) && contact.length()<=21 && contact.length() >=1){
		            	contactList[listIndex] = contact;
		            	listIndex++;
		            }
		            else if("find".equals(op) && contact.length()<=21 && contact.length() >=1){
		     	        	int count = 0;
//		     	        	for(int j=0;j<contactList.size();j++){
		     	        	for(int j=0;j<listIndex;j++){
		     	        		if(contactList[j].startsWith(contact)){
		     	        			count++;
		     	        		}
		     	        	}
		     	        	System.out.println(count);	            	
		            }
		        }
	        }
	
	
    */
		HashMap<String,Integer> contactList = new HashMap<String,Integer>();
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        if((n <= 100000) && (n >=1)){
		        for(int a0 = 0; a0 < n; a0++){
		            String op = in.next();
		            String contact = in.next();
		            if("add".equals(op) && contact.length()<=21 && contact.length() >=1){
//		            	contactList.add(contact);
		            	for(int i=0;i<=contact.length();i++){
		            		if(contactList.get(contact.substring(0, i))==null){
		            			contactList.put(contact.substring(0, i),1);
		            		}
		            		else{
		            			contactList.put(contact.substring(0, i),contactList.get(contact.substring(0, i))+1);
		            		}
		            	}
		            }
		            else if("find".equals(op) && contact.length()<=21 && contact.length() >=1){
		            		Integer count = contactList.get(contact);
		     	        	if(count == null){
		     	        		System.out.println(0);
		     	        	}	            	
		     	        	else{
		     	        		System.out.println(count);
		     	        	}
		            }
		        }
	        }
	
	
   
    	}
}
