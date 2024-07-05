package basic_program_ab42;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet_Collection1 {

	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		   l1.add(90);//Follows indexing and order of insertion
	       l1.add(21);
	       l1.add(55);
	       l1.add(21);
	       l1.add(null);//Accept null value only once
	       l1.add(null);
	       l1.add(null);
	       l1.add(55);//Duplicates will not accepting
	       l1.add(55);
	       l1.add(55);
	       l1.add("Anitha");// will accepts Heterogeneous values
	       l1.add("suni");
	       l1.add("pravee");
	       l1.add("poorvi");
	       l1.add("Lohith");
	      System.out.println(l1);
	    //  Collections .sort(l1);// sorting is not happening getting NullPointerException
		System.out.println(l1);
	}

}
