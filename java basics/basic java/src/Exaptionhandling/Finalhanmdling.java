package Exaptionhandling;

public class Finalhanmdling {

	public static void main(String[] args) {
		
		try {
			double div = 15/0;
			System.out.println(div);
		}catch (ArithmeticException e) {
		
			System.out.println("zero se nahi hoga");
			System.exit(0);
		}
		finally { System.out.println("chal raha h");}
		}

}
