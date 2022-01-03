package Interface;

public class Person1 {

	private String Firstname;
	private String lastname;
	private String address;
	
	public Person1() {
	
		System.out.println("Default");
		
	}
   public Person1(String fn,String ln) {
	  this();
	   Firstname = fn;
	   lastname = ln;
	   
	   System.out.println("Person 2 Parameterised");
	   System.out.println("First name : "+ fn);
	   System.out.println("last name : "+ln);
   }
   public Person1 (String fn,String ln,String add) {
	   this(fn,ln);
	   address = add;
	   System.out.println("Person 3 peramiterised"+" "+fn+" "+ln);
	   
   }
   public static void main(String[] args) {
	Person1 p = new Person1("monti","gupta","indore");
	System.out.println();
}
}
