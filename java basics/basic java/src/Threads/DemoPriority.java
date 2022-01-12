package Threads;

public class DemoPriority {
 
	   public static void main(String[] args) {
		
		   Dempothreads t1 = new Dempothreads ("ram");
		   Dempothreads t2 = new Dempothreads("shyama");
		   
		   
		   Thread th = new Thread(t1);
		   Thread tt = new Thread(t2);
		   
		   th.start();
		   tt.start();
		   
		   th.setPriority(1);
		   tt.setPriority(10);
	}
}
