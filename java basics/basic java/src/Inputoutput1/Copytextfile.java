package Inputoutput1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copytextfile {
    public static void main(String[] args) throws IOException {
		
    	
    	     String source = "D:/javainput.txt";
	         String target = "D:/javainput2.txt";
  
	            FileReader reader = new FileReader(source);
	            FileWriter writer = new FileWriter(target);
	            
	            int ch = reader.read();
	            while ( ch != -1) {
	            	writer.write(ch);
	            	ch = reader.read();
	            }
       writer.close();
       reader.close();
       System.out.println(source + "--" + target);
    }
    
}
