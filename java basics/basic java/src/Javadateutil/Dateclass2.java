package Javadateutil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Dateclass2 {
      public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat msd = new SimpleDateFormat("dd/mm/yyyy");
		String dt = msd.format(d);
		System.out.println(dt);
	
		
		String s = "05/12/2020";
		Date dd = msd.parse(s);
		System.out.println(dd);
	}
		
	}
	


