package Threads;

public class Testdemo {
    public static void main(String[] args) {
		
    	Dempothreads t1 = new Dempothreads("virat");
    	Dempothreads t2 = new Dempothreads("lordShardul");
    	Dempothreads t3 = new Dempothreads("gayle");
    	Dempothreads t4 = new Dempothreads("abd");
    	
    	
    	t1.start();
    	t2.start();
    	t3.start();
    	t4.start();
	}
}
