 package stockdemo;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Demo {
	public static void main(String[] args) throws IOException{
		final String SYM ="KO";
		URL url = new URL("https://www.google.com/finance?ei=AIS5WZCAGom6ugTH67RA&q=ko");
		URLConnection urlConn = url.openConnection();
		InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "not found";
		String line = buff.readLine();
		while(line != null){
			if(line.contains("[\"KO\",")){
			//	System.out.println(line);
				int target = line.indexOf("[\"KO\",");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '\"'){
					start--;
				}
				price = line.substring(start+1, deci+3);
			}
			line = buff.readLine();
		}
		System.out.println(price);
	}

}
