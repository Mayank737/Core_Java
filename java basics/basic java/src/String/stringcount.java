package String;

public class stringcount {
   public static void main(String[] args) {
	String str = "Monti";
	int count =0;
	for(int i = 0;i<str.length();i++){
	if(str.charAt(i)!=' ')
		count++;
	}
	System.out.println(count);
}
}
