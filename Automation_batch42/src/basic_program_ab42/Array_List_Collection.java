package basic_program_ab42;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_Collection {
   public static void main(String[] args) {
	ArrayList a1 = new ArrayList();//follows indexing,accepts null,accepts duplicate,follows insertion
	       a1.add(90);
	       a1.add(21);
	       a1.add(55);
	       a1.add(21);
	       a1.add(null);
	       a1.add(null);
	       a1.add(null);
	       a1.add(55);
	       a1.add(55);
	       a1.add(55);
	       a1.add("Anitha");//ArrayList follows Heterogeneous values
	       a1.add("suni");
	       a1.add("pravee");
	       a1.add("poorvi");
	       a1.add("Lohith");
	      System.out.println(a1);
	      Collections .sort(a1);//getting NullPointerException
		System.out.println(a1);
}
}
