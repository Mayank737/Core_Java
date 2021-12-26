package Inheritasnce;

public class Circle extends Shape{
   private int radius;

int getRadius() {
	return radius;
}

void setRadius(int radius) {
	this.radius = radius;
}
 public void area(){
	 double ar = 3.14*radius*radius;
	 System.out.println(ar);
 }
}