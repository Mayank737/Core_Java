package Oopsjava;

public class Textjava {
 public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderWidth(8);
	s.setColor("black");
	
	String c = s.getColor();
	System.out.println(c);
	System.out.println(s.getBorderWidth());
	
}
}
