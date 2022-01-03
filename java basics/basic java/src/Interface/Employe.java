package Interface;

public class Employe extends Person1{
	
	private String designation;
	
	public Employe() {
		System.out.println("Default");
	}
  public Employe(String fn,String ln,String des) {
	  super(ln,fn);
	  designation = des;
	  System.out.println("3 param constructerr"+" "+ln+" "+fn+" "+des);
	  
  }
	public static void main(String[] args) {
		Employe e = new Employe("monti","gupta","indore");
		
				
	}

}
