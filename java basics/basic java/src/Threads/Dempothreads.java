package Threads;

public class Dempothreads extends Thread{
   private String name;
   public Dempothreads(String n) {
	   name = n;
	   
   }
   @Override
   public void run() {
	   for (int i = 0; i < 11; i++) {
		System.out.println(i+" "+name);
	}
   }
}
