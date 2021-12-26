package Abstract;

public class Rectangle extends Shape {

	private int length = 0;
	private int width = 0;
	public Rectangle() {
		
	}
	public Rectangle (int len, int wid) {
		length = wid;
		width = len;
		
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area()
	{
		int area = length*width;
		System.out.println("Area of Rectangle--"+area);
		return 0;
	}

}
