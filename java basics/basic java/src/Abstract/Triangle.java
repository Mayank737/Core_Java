package Abstract;

public class Triangle extends Shape {

	private int base;
	private int Hieght;
	
public Triangle() {
		
	}
	
		public Triangle(int b, int h) {
			base = b;
			Hieght = h;
		}
	
	public int getBase() {
		return base;
	}

	public int getHieght() {
		return Hieght;
	}

	public  double area () {
		double area=((0.5)*(base*Hieght));
		System.out.println("Area or Traingle --"+area);
		return 0;
	}
}
