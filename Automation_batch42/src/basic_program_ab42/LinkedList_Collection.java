package basic_program_ab42;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Collection {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();//follows indexing,accepts null,accepts duplicate,follows insertion
		   l1.add(90);
	       l1.add(21);
	       l1.add(55);
	       l1.add(21);
	       l1.add(null);
	       l1.add(null);
	       l1.add(null);
	       l1.add(55);
	       l1.add(55);
	       l1.add(55);
	       l1.add("Anitha");// follows Heterogeneous values
	       l1.add("suni");
	       l1.add("pravee");
	       l1.add("poorvi");
	       l1.add("Lohith");
	      System.out.println(l1);
	      Collections .sort(l1);// sorting is not happening getting NullPointerException
		System.out.println(l1);
	}

}
