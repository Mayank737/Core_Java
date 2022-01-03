package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Retsinall {

	public static void main(String[] args) {
		
		List l = new ArrayList<>();
		  l.add(15);
		    l.add('M');
		    l.add("java");
		    l.add(6.78);
		    l.add('m');

		    List l2 = new ArrayList<>();
		    
		    l2.add(15);
		    l2.add('M');
		    l2.add("java");
		    l2.add(5.78);
		    l.add('n');
		    System.out.println(l2.retainAll(l));
		    System.out.println(l2);
		    
	}

}
