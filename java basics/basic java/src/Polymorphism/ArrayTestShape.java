package Polymorphism;

public class ArrayTestShape {

	public static void main(String[] args) {
		Shape [] s = new Shape[3];
		for (int i = 0; i < s.length; i++) {
			s[i] = getShape(i+1);
			
		}
		double totalarea = Calculatearea(s);
		System.out.println("Total area : "+ totalarea);
	}
	 public static double Calculatearea(Shape[] s) {
		 double totalarea = 0;
		 System.out.println(s.length);
		 for (int i = 0; i < s.length; i++) {
			 totalarea+=s[i].area();
			
		}
		 return totalarea;
	 }

	private static Shape getShape(int i) {
		// TODO Auto-generated method stub
		if (i==1) return new Rectangle(10,15);
		if (i==2) return new Triangle(10,5);
		if (i==3) return new Circle(6);
		Shape s = new Shape();
  		return s;
	}
	
}
