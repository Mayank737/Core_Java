
package Threads;

public class Timetestdemo {
	public static void main(String[] args) {
		
	
  Timedemothread t1  = new Timedemothread("monti");
  Timedemothread t2 = new Timedemothread("guptA");
 	
	t1.start();
	t2.start();
   
}
}