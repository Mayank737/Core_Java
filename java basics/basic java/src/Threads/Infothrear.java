package Threads;

public class Infothrear {
      
	   private static final String indent = "0";

	public static void main(String[] args) {
		Thread t = new Thread("my tread");
		log("",t);
	}

	private static void log(String string, Thread t) {
		// TODO Auto-generated method stub
		System.out.println(indent + "Thread name  -"+t.getName());
		System.out.println(indent +"id  -"+t.getId());
		System.out.println(indent+"priority  -"+t.getPriority());
		System.out.println(indent + "State  -"+t.getState());
		System.out.println(indent +"Thread group  -" +t.getThreadGroup().getName());
		System.out.println(indent + " is alive  -"+t.isAlive());
		System.out.println(indent + "is daemon  -"+ t.isDaemon());
		
	}
	   
}
