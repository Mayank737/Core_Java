package Threads;

public class Testhellothread {
     
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("monti");
		HelloThread t2 = new HelloThread("gupta");
		
		Thread th = new Thread(t1);
		Thread tt = new Thread(t2);
		
		th.start();
		tt.start();
	}
}
