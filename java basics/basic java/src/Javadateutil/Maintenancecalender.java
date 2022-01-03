package Javadateutil;
  
import java.util.*;
public class Maintenancecalender {
	public static void main(String args[])
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("The installation Date is: " + cal.getTime());
		System.out.println("");
				
		for (int i = 1; i < 12; i++) {
			
			cal.add(cal.DATE, +30);
			System.out.println("The "+i+" date is: "+cal.getTime());
		}
		
	}
}
