package javaloops;

public class Palindrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=454,rem,temp,rev=0;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
		System.out.println("number is palindrome ");
		else
		System.out.println("number is not palindrome ");
	}

}
