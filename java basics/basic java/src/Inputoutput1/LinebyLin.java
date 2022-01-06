package Inputoutput1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LinebyLin {
    public static void main(String[] args) throws IOException {
		
    	FileReader reader = new FileReader("D:/javainput.txt");
    	BufferedReader br = new BufferedReader(reader);
    	
    	String line = br.readLine();
    	
    	while(line != null) {
    		System.out.println(line);
    		line = br.readLine();
    	}
    	reader.close();
	}
}
