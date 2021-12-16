
public class Arraycopy {
	public static void main(String[] args) {
		char[] ch = {'a','b','c','d','e','t','u','k','h'};
		char[] cp = new char [8];
		System.arraycopy(ch,1,cp,0,8);
		for(char c: cp)
			System.out.println(c);
		
	}

}
