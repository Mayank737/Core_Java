package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {

     public static void main(String[] args) {
		
    	 List l = new ArrayList<>();
    	  l.add(15);
  	      l.add('M');
  	      l.add("java");
  	      l.add(6.78);
     System.out.println(l);
  	      List l2 = new ArrayList<>();
  	      
  	    l2.add(13);
	    l2.add('N');
	    l2.add("java");
	    l2.add(6.78);

	    System.out.println(l2.removeAll(l2));
  	      System.out.println(l2);
  	    
  	      
	}	
	

}
