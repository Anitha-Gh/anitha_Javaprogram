package ab30;

public class ThisKeyWord 
{
   int age;
   double height;
   String name;
  void add(int age,double height,String name)
  {
	  System.out.println("This key word program");
	  this.age=age;
	  this.height=height;
	  this.name= name;
  }
  
	public static void main(String[] args) {
		
		ThisKeyWord t1 = new ThisKeyWord ();
		  t1.add(20,5.5 ,"Mkt");
		  System.out.println(t1.age);
		  System.out.println(t1.height);
		  System.out.println(t1.name);
	}

}
