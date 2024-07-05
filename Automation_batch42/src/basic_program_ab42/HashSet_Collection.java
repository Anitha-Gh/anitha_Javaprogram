package basic_program_ab42;

import java.util.HashSet;

public class HashSet_Collection {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		   h1.add(90);//HS is not following indexing and order of insertion
	       h1.add(21);
	       h1.add(55);
	       h1.add(21);
	       h1.add(null);//HS will accepting null value only once
	       h1.add(null);
	       h1.add(null);
	       h1.add(55);//Duplicates is not  possible
	       h1.add(55);
	       h1.add(55);
	       h1.add("Anitha");//PQ will accepts Heterogeneous values
	       h1.add("suni");
	       h1.add("pravee");
	       h1.add("poorvi");
	       h1.add("Lohith");
	      System.out.println(h1);
	     // Collections .sort(h1);// sorting is not happening getting NullPointerException
		System.out.println(h1);
	}




	}


