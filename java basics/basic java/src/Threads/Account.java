package Threads;

public class Account {
 
	 private int balence = 0;
	 
	 public synchronized  void deposit(String msg, int amt) {
		 
			int bal = getBalence() + amt ;
			 setBalence( bal);
		 System.out.println(msg+"  "+ getBalence());
	 }

	public int getBalence() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balence;
	}

	public void setBalence(int balence) {
		this.balence = balence;
	}
	 
	 
}
