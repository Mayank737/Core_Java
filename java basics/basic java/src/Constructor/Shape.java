package Constructor;

public class Shape {

	private String color;
	private int borderWidth;
	
	public Shape(){
		
	}
    public Shape (String s,int b) {
    	color = s;
    	borderWidth = b;
    }
	String getColor() {
		return color;
	}
	int getBorderWidth() {
		return borderWidth;
	}
    
}
