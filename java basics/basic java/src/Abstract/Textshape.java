package Abstract;


public abstract class Textshape {

	public static void main(String[] args) {
		Shape s = new Circle(5);
		
	  
	   
	   Shape s1 = new Rectangle(10,20);
	   s1.area();
	   
	   Shape s2 = new Triangle(15,5);
	   s2.area();
	   
	   s.area();
			 
	}
}
