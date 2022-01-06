package Sorting;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

import CollectionFramework.Itrator1;

public class Textmarksheet {
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		m1.setRollno("1");
		m1.setFname("monti");
		m1.setLname("gupta");
		m1.setPhy(67);
		m1.setMat(77);
		m1.setChe(87);
		
		
		Marksheet m2 = new Marksheet();
		m2.setRollno("4");
		m2.setFname("mayank");
		m2.setLname("sharma");
		m2.setPhy(77);
		m2.setMat(78);
		m2.setChe(79);
		
		
		
		Marksheet m3 = new Marksheet();
		m3.setRollno("3");
		m3.setFname("baba");
		m3.setLname("gupta");
		m3.setPhy(87);
		m3.setMat(88);
		m3.setChe(89);
		
		
		Marksheet m4 = new Marksheet();
		m4.setRollno("2");
		m4.setFname("hari");
		m4.setLname("gupta");
		m4.setPhy(97);
		m4.setMat(98);
		m4.setChe(99);
		
		ArrayList l = new ArrayList<>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		
		Collections.sort(l);
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Marksheet m = (Marksheet) it.next();
			
		
			System.out.println(m.getRollno()+" "+m.getFname()+" "+m.getLname()+" "+m.getPhy()+" "+m.getMat()+" "+m.getChe());
		}
	
	}

}
