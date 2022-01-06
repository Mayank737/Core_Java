package Inputoutput1;

import java.io.File;
import java.sql.Date;

public class Textclass {
	 public static void main(String[] args) {
			File f = new File("D:/javainput.txt");
			
			if(f.exists()) {
				System.out.println("Name : " + f.getName() );
				System.out.println("path : "+f.getAbsolutePath());
				System.out.println("is witable : "+f.canWrite());
				System.out.println("reADAable  = "+ f.canRead());
				System.out.println("Is file : " + f.isFile());
				System.out.println("is Directory  -- "+ f.isDirectory());
				System.out.println("last modified -- " + new Date(f.lastModified())+" "+new Date(f.lastModified()).getTime());
				System.out.println("Length -- "+ f.length());
			}
		}
}
