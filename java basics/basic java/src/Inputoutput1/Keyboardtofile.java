package Inputoutput1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Keyboardtofile {
   public static void main(String[] args) throws IOException {
	
	   
	     String target = "D:/javainput.txt";
	     
	     FileWriter writer = new FileWriter(target);
	     PrintWriter printwriter = new PrintWriter(writer);
	     
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(isr);
	    
	    String line = in.readLine();
	    while(!line.equals("quit")) {
	    	printwriter.println(line);
	    	line = in.readLine();
	    }
	    	printwriter.close();
	    	isr.close();
	    	
	    	

}
}
