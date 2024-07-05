package basic_program_ab42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Behaviour {

	public static void main(String[] args) {
		//upcasting ArrayList to List
		   //check indexing-List Follows indexing 
		       List l1 = new ArrayList();//upcasting
		       l1.add(90);
	            l1.add(20);
	            l1.add(13);
	            l1.add(53);
	            l1.add(32);
	            l1.add(87);
	         System.out.println(l1); 
	         //List Accepts null
	            l1.add(null);
	            l1.add(null);
	            l1.add(null);
	         System.out.println(l1);
             //List accepts duplicate
	         l1.add(20);
	         l1.add(20);
	         l1.add(20);
	         Collections.sort(l1);	}

}
