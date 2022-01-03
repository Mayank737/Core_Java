package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Containall {
	public static void main(String[] args) {
		
	
	List l = new ArrayList<>();
	/*l.add(15);
    l.add('M');
    l.add("java");
    l.add(6.78);*/
    
    l.add(14);
    l.add('N');
    l.add("jaava");
    l.add(99.78);
  
    List l2 = new ArrayList<>();
   
    l2.add(15);
    l2.add('M');
    l2.add("java");
    l2.add(6.78);
    System.out.println(l.containsAll(l2));
}
}