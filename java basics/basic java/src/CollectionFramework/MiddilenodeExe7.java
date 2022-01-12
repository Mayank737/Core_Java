package CollectionFramework;

import java.util.LinkedList;

public class MiddilenodeExe7 {
  
	 public static void main(String[] args) {
		LinkedList j = new LinkedList();
		
		j.add(40);
		j.add(42);
		j.add(44);
		j.add(46);
		j.add(47);
		j.add(48);
		j.add(49);
		j.add(41);
		System.out.println(j);
		
		int middle = (int) (j.get(j.size()/2));
		System.out.println(middle);
	}
}
