package Sorting;

import java.util.Comparator;

public class Sortbyphy implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return (o1.getPhy()-o2.getPhy());
	}

}
