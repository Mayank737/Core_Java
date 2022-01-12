package Inputoutput1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scannerwhileloop {
       public static void main(String[] args) throws Exception  {
		
    	      FileReader f = new FileReader("C:\\newtest.txt");
    	      Scanner sc =  new Scanner(f);
    	      
    	      while(sc.hasNext()){
    	    	  System.out.println(sc.hasNext());
    	      }
    	      sc.close();
    	   
		 
	}
}
