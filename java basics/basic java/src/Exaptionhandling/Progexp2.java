package Exaptionhandling;

public class Progexp2 {
    
	   public static void main(String[] args) {
		
	try {
		String s = null;
		System.out.println(s.length());
	} catch(NullPointerException e) {
		System.out.println("Exception is empty");
	}
	   }
}
