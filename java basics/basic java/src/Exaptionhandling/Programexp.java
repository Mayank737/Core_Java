package Exaptionhandling;

public class Programexp {
    
	public static void main(String[] args) {
		
	try {
		double div = 15/0;
		System.out.println(div);
	}catch (ArithmeticException e) {
	
		System.out.println("zero se nahi hoga");
	}
	finally { System.out.println("chal raha h");}
	}
}
