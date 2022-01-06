package CollectionFramework;

public class EqaulHashcode {
  public static void main(String[] args) {
	
	  String s1 = "rays";
	  String s2 = "rays";
	  
	  
	  String s3 = "monti";
	  String s4 = "Monti";
	  
	  System.out.println(s3.equals(s4));
	  System.out.println(s1.equals(s2));
	  System.out.println(s1.hashCode());
	  System.out.println(s2.hashCode());
	  System.out.println(s3.hashCode());
	  System.out.println(s4.hashCode());
}
}
