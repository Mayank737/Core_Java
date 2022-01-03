package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Clear {

	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(15);
	    l.add('M');
	    l.add("java");
	    l.add(6.78);
	    System.out.println(l);
	    l.clear();
	    System.out.println("list is clear : "+l);
	}

}
