package javaloops;

public class factorialnumber {
  public static void main(String[] args) {
	int n=8,fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println("Factorial="+fact);
}
}
