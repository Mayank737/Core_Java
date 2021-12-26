package Constructor;

public class ConstrPi {
	public static final double PI = 3.14;
	private String color;
	private int borderWidth;
	
	public ConstrPi() {
		
	}
  public ConstrPi(String c,int t) {
	  color = c;
	  borderWidth = t;
  }

String getColor() {
	return color;
}
int getBorderWidth() {
	return borderWidth;
}
  
}
