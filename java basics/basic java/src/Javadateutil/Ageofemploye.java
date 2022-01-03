package Javadateutil;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;


public class Ageofemploye {

	
	public static void main(String[] args) throws ParseException {
		LocalDate L = LocalDate.of(1998,10,17);
		LocalDate now = LocalDate.now();System.out.println();
		Period diff = Period.between(L,now);
		System.out.println(diff.getYears()+"years"+diff.getMonths()+"month"+diff.getDays()+"days");
		
		String s = "2021/12/27";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d = sdf.parse(s);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		
		LocalDate L1 = LocalDate.of(year, month, month);
		LocalDate now1 =LocalDate.now();
		Period diff1 = Period.between(L, now);
		
		System.out.println("age" +"-years :"+ diff1.getYears());
		System.out.println("    month :"+diff1.getMonths());
		System.out.println("    date :"+diff1.getDays());
	}
}

	/*static void caluculateAge(LocalDate  dateofbirth, LocalDate currentdate)   
    {
		 
        Period difference = Period.between(dateofbirth, currentdate);   
                System.out.println("The age of this employee is:");   
                //System.out.printf( "%d years,  %d months and %d days",
               System.out.println("years"+"months"+"days");         
               
            difference.getYears();
            difference.getMonths();
            difference.getDays();
   
    }
	 public static void main(String[] args)   
	    {   
	          
	        LocalDate dateofbirth = LocalDate.of(1998, 10, 17);   
	        LocalDate currentdate = LocalDate.of(2021, 12, 27);  
	        caluculateAge(dateofbirth, currentdate);   
	    }   
}
*/

