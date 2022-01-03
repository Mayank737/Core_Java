package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Itrator1 {

	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		   v.add(3);
		   v.add(7);
		   v.add(8);
		   v.add(44);
		   System.out.println(v);
		 java.util.Iterator it = v.iterator();  
		
		   
		while (it.hasNext()) {
			int object = (int) it.next();
			System.out.println(object);
		}
			
		
		
		}
}
