package String;

public class Helloallswitch {
 public static void main(String[] args) {
	int size = args.length;
	System.out.println(size);
	switch (1) {
	
	case(0):
		System.out.println("no args");
	break;
	case (1):
		System.out.println(args[0]);
		break;
		default:
			for(int i = 0;i<size;i++) {
				System.out.println("hello"+args[i]);
	}
}
}
}