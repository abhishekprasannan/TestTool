package hR_2017;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        ArrayList<Character> openList = new ArrayList<Character>();
    	char openCh = ' ';
    	char expectedCh = ' ';
        for(int i=0;i<expression.length();i++){
        	char tempCh = expression.charAt(i);
        	if(isClosedBracket(tempCh) && openList.isEmpty()){
        		return false;
        	}
        	else if(!isClosedBracket(tempCh)){
        		openList.add(tempCh);
        		openCh = tempCh;
        		if(tempCh == '{'){
            		expectedCh = '}';
            	}
            	else if(tempCh == '['){
            		expectedCh = ']';
            	}
        		else if(tempCh == '('){
        			expectedCh = ')';
        		    	}
        		
        	}
        	else if(isClosedBracket(tempCh)){
        		if(tempCh != expectedCh){
        			return false;
        		}
        		else if(tempCh == expectedCh){
        			openList.remove(openList.size()-1);
        			if(!openList.isEmpty()){
        				openCh = openList.get(openList.size()-1);
        			}
        			if(openCh == '{'){
                		expectedCh = '}';
                	}
                	else if(openCh == '['){
                		expectedCh = ']';
                	}
            		else if(openCh == '('){
            			expectedCh = ')';
            		    	}
        		}
        	}
        }
        if(!openList.isEmpty()){
        	return false;
        }
    	return true;
    }
    public static boolean isClosedBracket(char ch){
    	if(ch == '}'){
    		return true;
    	}
    	else if(ch == ']'){
    		return true;
    	}
		else if(ch == ')'){
			return true;
		    	}
    	return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

