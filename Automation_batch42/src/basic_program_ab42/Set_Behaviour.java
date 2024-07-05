package basic_program_ab42;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Set_Behaviour {

	public static void main(String[] args) {
	  Set s1 = new LinkedHashSet();//set follows indexing
             s1.add(15);//order of insertion is happening here
             s1.add(25);
             s1.add(135);
             s1.add(105);
             s1.add(155);
             System.out.println(s1);
             s1.add(null);//set will accept null values only one time
             s1.add(null);
             s1.add(null);
             System.out.println(s1);
             s1.add(15);//set will not accept duplicate values
             s1.add(15);
             s1.add(15);
             s1.add(15);
             System.out.println(s1);
             
	}

}
