package Inputoutput1;

import java.util.Scanner;

public class ScannerClassAdd {
 public static void main(String[] args) {
	

	Scanner s = new Scanner(System.in);
	
   /*System.out.println("String name : ");
	String st = s.nextLine();
	System.out.println(st);*/    // String chalane k liye 
	
	System.out.println("firsrt number -- ");
	int a = s.nextInt();
	
	System.out.println("Second number -- ");
	int b = s.nextInt();
	

	int c =  a+b;
	System.out.println("total :"+ c);
	
	
	
}
}
