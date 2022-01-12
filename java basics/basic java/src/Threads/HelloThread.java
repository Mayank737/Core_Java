package Threads;

public class HelloThread  implements Runnable {

	  private String name;
	   public HelloThread (String m) {
		   name = m;
		   
	   }
	   @Override
	   public void run() {
		   for (int i = 0; i < 11; i++) {
			System.out.println(i+" "+name);
		}

}
}
	   