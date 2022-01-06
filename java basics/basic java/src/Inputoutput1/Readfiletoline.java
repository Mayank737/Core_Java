package Inputoutput1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Readfiletoline {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("D:/javainput.txt");
		PrintWriter pw = new PrintWriter(writer);
		
		
		pw.println("monti");
		pw.println("gupta");
		pw.println("java");
		pw.println("rays");
		pw.println("terch");
	
    pw.close();
    writer.close();
    System.out.println("done");
	}
    
}
