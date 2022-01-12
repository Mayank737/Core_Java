package Inputoutput1;

import java.io.Serializable;

public class Employeser implements Serializable{
        
	     private int id;
	     private String name;
	     private transient String psw;
	     
	    public Employeser(){
          	
}
	    public Employeser(int id,String name,String psw) {
	    	this.id=id;
	    	this.name=name;
	    	this.psw=psw;
	  
	    }
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getPsw() {
			return psw;
		}	
}