package CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
   
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		Stack s2 = new Stack();
		Stack s3 = new Stack();
		
		s1.push('a');
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
	
		for (char i = 'a'; i <= 'z'; i++) {
			s1.push(i);
			
		}
	    System.out.println("s1 Stack : " + s1);
	    System.out.println(" ");
	    
	    for (char i = 'a'; i <= 'z'; i++) {
	    	s2.push(s1.pop());
	    	
	    }
	    System.out.println("s1 Stack :"+s1);
	    System.out.println(" ");
	    System.out.println("s1 Stack : "+s2);
	    
	    for (int i = 'z'; i >='a'; i--) {
			s3.push(s2.pop());
		}
	    System.out.println("s1 stack : " + s1);
	    System.out.println(" ");
	    System.out.println("s2 Stack : "+ s2);
	    System.out.println("s3 Stack : "+ s3);
	}

}
