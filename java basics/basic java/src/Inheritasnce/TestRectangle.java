package Inheritasnce;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(55);
		r.setWidth(100);
		
		r.area();
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
	}

}
