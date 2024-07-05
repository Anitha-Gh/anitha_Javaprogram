package hybridlevelinheritanc;



		

class Saturday extends Thursday
{
	static void Mat()
	{ 
		System.out.println("i have mat");
	}
   void Mat1()
   {
	   System.out.println("i have m at1");
   
}
}
class Friday extends Thursday{
	static void rat()
	{ 
		System.out.println("i have rat");
	}
   void rat1()
   {
	   System.out.println("i have rat1");
   
}
 
   
}

class Thursday{
	static void cat()
	{ 
		System.out.println("i have cat");
	}
   void cat1()
   {
	   System.out.println("i have cat1");
   }
}
class Wednesday extends Thursday{
	static void sub() {
		System.out.println("wednesday");
	}
   void sub1() {
	   System.out.println("wednesday1");
   }
}



class Tuesday extends Wednesday{
	static void add() {
   System.out.println("tuesday");
	}
	void add1()
	{
		System.out.println("tuesday1");
	}
}
public class Month1 extends Tuesday {
	


	public static void main(String[] args) {
		
		
	add();
	Month1 m1= new Month1();
	m1.add1();
	sub();
	m1.sub1();
	cat();
	m1.cat1();
	
	Friday f1 = new Friday();// there is no relation between Month1 nd Friday. so to access Friday's methods, we can create an object of Friday
	
	f1.rat1();
	f1.rat();

	Saturday s1 = new Saturday();
	s1.Mat();
	s1.Mat1();
	
	

	}
	
	
}


