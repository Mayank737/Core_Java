package Constructor;

public class Triangle {
    
	private int height;
	private int base;
	
	public Triangle() {
	}
		public Triangle (int h,int b) {
		height = h;
		base = b;
		
	}
		public int getHeight() {
			return height;
		}
		public int getBase() {
			return base;
		}
		public void area() {
			double area = ((0.5)*(height*base));
			System.out.println("Area of Triangle : "  + area);
		}
}
