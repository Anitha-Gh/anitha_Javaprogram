package basic_program_ab42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		     a1.add("Anitha");
		     a1.add("lohith");
		     a1.add("Poorvi");
		     a1.add("Haarika");
		     a1.add("Ritu");
		     System.out.println(a1);
		     Iterator i1 = a1.iterator();
		     while(i1.hasNext())
		     {
		    	 System.out.println(i1.next());
		     }
		     System.out.println("Lets iterate in the forward direction");
		    ListIterator i2 = a1.listIterator();
		    while(i2.hasNext()) 
		    {
		    	System.out.println(i2.hasNext());
		    }	
		    System.out.println("Lets iterate in backward directio");
		    while(i2.hasPrevious())
		    {
		    	System.out.println("i2.previous()");
		    }
		    	
		    	
		    }
		    
	}
	

