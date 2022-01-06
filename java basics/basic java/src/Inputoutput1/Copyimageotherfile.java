package Inputoutput1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyimageotherfile {
   
	 
	   public static void main(String[] args) throws IOException {
		
		   
		   String Source = "D:/test.jpg";
		   String target = "D:/javainput1.jpg";
		   
		   FileInputStream reader = new FileInputStream(Source);
		   FileOutputStream writer = new FileOutputStream(target);
		   
		   int ch = reader.read();
		   while(ch != -1) {
			   writer.write(ch);
			   ch = reader.read();
			   }
		   
		   writer.close();
		   reader.close();
		   System.out.println(Source + " --  copied   to  -- " + target);
	}
}
