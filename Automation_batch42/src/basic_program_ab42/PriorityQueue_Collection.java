package basic_program_ab42;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Collection {

	public static void main(String[] args) {
		
		PriorityQueue p1= new  PriorityQueue();
		   p1.add(90);//PQ is not following indexing and order of insertion
	       p1.add(21);
	       p1.add(55);
	       p1.add(21);
	      /* p1.add(null);//PQ will not accepting null values
	       p1.add(null);
	       p1.add(null);*/
	       p1.add(55);//Duplicates is possible
	       p1.add(55);
	       p1.add(55);
	     /*p1.add("Anitha");//PQ will not accepts Heterogeneous values
	       p1.add("suni");
	       p1.add("pravee");
	       p1.add("poorvi");
	       p1.add("Lohith");*/
	      System.out.println(p1);
	     // Collections .sort(p1);// sorting is not happening getting NullPointerException
		System.out.println(p1);
	}

}
