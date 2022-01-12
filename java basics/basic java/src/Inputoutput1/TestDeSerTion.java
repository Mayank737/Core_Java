package Inputoutput1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerTion {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("D:/object.ser");
		ObjectInputStream sr = new ObjectInputStream(fi);
		
		Employeser e = (Employeser) sr.readObject();
		
		sr.read();
		sr.close();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getClass());
		System.out.println(e.getPsw());
		
	}
}