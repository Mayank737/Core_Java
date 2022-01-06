package Inputoutput1;

import java.io.File;

public class DirectryList {
   public static void main(String[] args) {
	
	   File directry = new File("C:/");
	   File[] list = directry.listFiles();
	   for (int i = 0; i < list.length; i++) {
		
		if(list[i].isFile())
		System.out.println((i+1)+ " : "+ list[i].getName());
	}
}
}
