package Polymorphism;

public class Circle  extends Shape {

	public static void main(String[] args) {
		
	}
	private int radius;
	
	public Circle(int r)
	{
		radius = r;
	}
	public double area() {
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle :"+area);
		return 0;
	}
	public int getRadius()
	{
		return radius;
	}
	 }

