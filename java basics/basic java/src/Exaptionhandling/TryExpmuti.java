package Exaptionhandling;

import javax.management.RuntimeErrorException;

public class TryExpmuti {
   
	  public static void main(String[] args) throws RuntimeException {
		try {
			String s = "Javaper";
			System.out.println(s.length());
			System.out.println(s.charAt(4));
				try {
					double div = 15/0;
					System.out.println(div);
				}catch (RuntimeException e) {
					System.out.println("zero se nahi hoga");
	         	} 
					
		} catch (RuntimeException e) {
			System.out.println("nahi hoga");
		}
		
		//finally { System.out.println("chal raha h");}
		
	  }
}
