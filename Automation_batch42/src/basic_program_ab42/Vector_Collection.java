package basic_program_ab42;

import java.util.Collections;
import java.util.Vector;

public class Vector_Collection {

	public static void main(String[] args) {
		Vector v1 = new Vector();//follows indexing,accepts null,accepts duplicate,follows insertion
		   v1.add(90);
	       v1.add(21);
	       v1.add(55);
	       v1.add(21);
	       v1.add(null);
	       v1.add(null);
	       v1.add(null);
	       v1.add(55);
	       v1.add(55);
	       v1.add(55);
	       v1.add("Anitha");//Vector follows Heterogeneous values
	       v1.add("suni");
	       v1.add("pravee");
	       v1.add("poorvi");
	       v1.add("Lohith");
	      System.out.println(v1);
	      Collections .sort(v1);//getting NullPointerException
		System.out.println(v1);
}



	}


