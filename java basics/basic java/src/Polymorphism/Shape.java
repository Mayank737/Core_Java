package Polymorphism;

public class Shape {
   private int Borderwidth;
   private String color;
   public double area ()	
  {
	   return 0;
  }
   public Shape() {
	
    }
  public Shape(String s, int b) {
	  color = s;
	  Borderwidth = b;
  }
public int getBorderwidth() {
	return Borderwidth;
}
public String getColor() {
	return color;
}
  
}