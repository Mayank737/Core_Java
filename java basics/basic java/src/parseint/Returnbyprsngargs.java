package parseint;

public class Returnbyprsngargs {
	public int add(int a,int b)
	{
		return a+b;
	}
   public static void main(String[] args) {
	Returnbyprsngargs r = new Returnbyprsngargs();
	int c = r.add(16, 34);
	System.out.println(c);
}
}
