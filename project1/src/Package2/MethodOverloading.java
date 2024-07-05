package Package2;

public class MethodOverloading {
static void add()
{
	System.out.println("static method with no parameter");
}
static void add(int a,int b)
{
	System.out.println("static metho with parameters");
	}
 static  void add(char a)
{
	  System.out.println ("a");
}

 static void add(double f)
{
	System.out.println("i am double");
}
static void add(int a)
{
	System.out.println("i am single");
}
	static void add(boolean T)
	{ 
		System.out.println("true");
		
	}
static void add (int a, double b)
{
	System.out.println("india");

}

  static void add(String a)
{
	System.out.println("INDIA");
}
 static void add(boolean T ,String d )
{
	System.out.println("hello");
	
}
 public static void main(String[] args) 
 {
    add();
    add(2,3);
    add('a');
    add();
    add(10);
    add();
    add(12);
    add('a');
    add("anitha");
 }}
		

	


