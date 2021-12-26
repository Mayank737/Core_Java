package Inheritasnce;
public class TestCircle {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5);
		c.setBorderWidth(7);
		c.setColor("black");
		
		c.area();
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
	}

}
