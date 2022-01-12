package Sorting;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class  TestReadExternal {
   public static void main(String[] args) throws Exception {
	
	   FileInputStream file = new FileInputStream("D:/saket.ser");
	   ObjectInputStream in = new ObjectInputStream(file);
	   
	   MarksheetExternal m = (MarksheetExternal) in.readObject();
	   System.out.println("name :" + m.getName());
	   System.out.println("maths :"+m.getMaths());
	   System.out.println("chemistry :"+m.getChemistry());
	   System.out.println("physics :"+m.getPhysics());
	   System.out.println("total mark :"+m.getTotal());
	   System.out.println("percentage : "+ m.getPercentage());
	   
	   in.close();
	   file.close();
	   
}
}
