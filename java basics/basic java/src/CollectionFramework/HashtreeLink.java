package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashtreeLink {
  public static void main(String[] args) {
	Set s1 = new HashSet();
	
	s1.add(13);
	s1.add("monti");
	s1.add(34);
	s1.add(44);
	s1.add(55);
	s1.add(66);
	s1.add(71);
	
	Iterator i = s1.iterator();
	while (i.hasNext()) {
		Object s11 = (Object) i.next();
		System.out.println("hashset : " + s11);
		
	}
	Set s2 = new LinkedHashSet<>();
	s2.add(76);
	s2.add(56);
	s2.add(82);
	s2.add(79);
	s2.add("monti");
	s2.add(78);
	s2.add('d');
	
	Iterator i1 = s2.iterator();
	while (i1.hasNext()) {
		Object s20 = (Object) i1.next();
		System.out.println("Hashset : " + s20);
		
	}
	Set s3 = new TreeSet<>();
	
	s3.add(66);
	s3.add(87);
	s3.add(93);
	s3.add(73);
	s3.add(43);
	s3.add(78);
	s3.add(99);
	
	Iterator i2 = s3.iterator();
	while (i2.hasNext()) {
		Object s35 = (Object) i2.next(); 
		System.out.println("Hastset :" + s35);
		
	}
	}
	
	}


