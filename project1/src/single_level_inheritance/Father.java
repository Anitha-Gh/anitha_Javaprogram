package single_level_inheritance;
public class Father 
{
  static void parent() 
  {
	System.out.println("i am parent");
		}
	static void car() {
		System.out.println("i want car");
	}
}
   class child extends Father
	{
    static void add() 
	{
		System.out.println("i am child");
	}

     public static void main(String[] args) {
	
      parent();
      add();
      car();}
      
}
