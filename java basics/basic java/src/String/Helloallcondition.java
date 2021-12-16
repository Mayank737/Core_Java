package String;

public class Helloallcondition {
	public static void main(String[] args) {
		int size = args.length;
		if(size==0) {
			System.out.println("Hello bhai");
		}
		else
		{
			for (int i = 0;i < size ;i++)
				System.out.println(i+"size is --"+args[i]);
		}
	}

}
