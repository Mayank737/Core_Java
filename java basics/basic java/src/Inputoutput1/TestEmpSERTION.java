package Inputoutput1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmpSERTION {
  public static void main(String[] args) throws IOException {
	FileOutputStream fi = new FileOutputStream("D:/object.ser");
	ObjectOutputStream stream = new ObjectOutputStream(fi);
	
	Employeser e = new Employeser(1,"monti","newday");
	
	 stream.writeObject(e);
	 stream.close();
	 fi.close();
	
	
	System.out.println("done");
}
}
