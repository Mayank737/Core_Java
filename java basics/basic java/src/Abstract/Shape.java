package Abstract;

public abstract class Shape {

	 private int Borderwidth;
	   private String color;
	   
	   public  abstract double area ();	
	  
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
