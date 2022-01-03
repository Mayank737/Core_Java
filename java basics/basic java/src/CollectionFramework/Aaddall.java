package CollectionFramework;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

public class Aaddall {

	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(15);
	    l.add('M');
	    l.add("java");
	    l.add(6.78);
	    
  System.out.println(l);
	List l2 = new ArrayList<>();
	l2.add(18);
    l2.add('G');
    l2.add("C++");
    l2.add(3.98);
l.addAll(l2);
System.out.println(l);
    
}
}
