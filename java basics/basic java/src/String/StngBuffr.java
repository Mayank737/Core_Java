package String;

public class StngBuffr {
   public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Monti");
	System.out.println(sb);
	System.out.println(sb.append(" gupta"));
	System.out.println("length:"+ sb.length());
	System.out.println("Capacity:"+ sb.capacity());
	System.out.println("Char at:"+sb.charAt(10));
	System.out.println("Index of - "+sb.indexOf("gupta"));
//	System.out.println("Replace-"+sb.replace(3, 5, "ud"));
//	System.out.println("Replace-"+sb.replace(5, 8, "ud"));
	System.out.println("Reverse--"+ sb.reverse( ));
}
}
