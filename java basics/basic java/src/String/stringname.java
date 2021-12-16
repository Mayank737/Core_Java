package String;

public class stringname {
	public static void main(String[] args) {
		String name = "Monti Baba Gupta";
		String Mg = new String ("monti12");
		{
	       System.out.println(Mg);
	       }
		{
           System.out.println(name);
		   System.out.println("String Length:" + name.length());
		   System.out.println("7th character is:" + name.charAt(6));
		   System.out.println("Baba index is:" + name.indexOf("ba"));
		   System.out.println("First i position:" + name.indexOf("i"));
		   System.out.println("last G position:"+ name.lastIndexOf("G"));
		   System.out.println("a is replased by b-"+ name.replace("a","b"));
		   System.out.println("lower Monti:"+ name.toLowerCase());
		   System.out.println("upper case--"+name.toUpperCase());
           System.out.println("Start with monti--"+name.startsWith("Monti"));
           System.out.println("Start with monti--"+name.startsWith("baba"));
           System.out.println("ends with pta--"+name.endsWith("baba"));
           System.out.println("ends with pta--"+name.endsWith("pta"));
           System.out.println("Syubstring:-"+name.substring(9));
		}
	}

}
