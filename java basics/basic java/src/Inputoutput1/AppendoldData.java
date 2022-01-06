package Inputoutput1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendoldData {
     
	    public static void main(String[] args) throws IOException {
			FileWriter writer = new FileWriter("D:/javainput.txt",true);
			PrintWriter pw = new PrintWriter(writer);
			
			pw.println("dheraj");
			pw.println("yash");
			pw.println("kapil");
			pw.println("vishuu");
			pw.println("fshim");
			
			pw.close();
			writer.close();
			
			System.out.println("done");
			
		}
	
	   
}
