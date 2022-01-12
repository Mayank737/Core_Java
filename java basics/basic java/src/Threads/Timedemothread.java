package Threads;

public class Timedemothread extends Thread {

	private String name;
	
	public Timedemothread(String n) {
	name = n;
}
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i+" "+name);
		}
	}
	   
}
