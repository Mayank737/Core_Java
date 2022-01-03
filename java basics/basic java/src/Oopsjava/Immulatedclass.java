package Oopsjava;

final class Immulatedclass {
     private final String Brand;
     private final String model;
     private final int makeYear;
     
     
     public Immulatedclass(String a, String b,int c) {
    	Brand = a;
    	model = b;
    	makeYear = c;
    	
    	 
     }


	public String getBrand() {
		return Brand;
	}


	public String getModel() {
		return model;
	}


	public int getMakeYear() {
		return makeYear;
	}
     public static void main(String[] args) {
    	 Immulatedclass s = new Immulatedclass("Tata","nano",2012);
		System.out.println(s.getBrand());
		System.out.println(s.getModel());
		System.out.println(s.getMakeYear());
	}
}
