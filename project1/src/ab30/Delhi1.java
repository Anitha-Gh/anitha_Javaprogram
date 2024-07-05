package ab30;//This calling program

public class Delhi1 {

	Delhi1(int a)
	{
		System.out.println("1");
    }
	Delhi1(int c, double f, String s)
	{   
		this(1000);
		System.out.println("2");
	}

	Delhi1(int a,String b)
	{   
		this(22,3.14,"mkt");
		System.out.println("3");
	}

	Delhi1(double c)
	{   
		this(1000,"ani");
		System.out.println("4");
	}

	Delhi1(double c,int i)
	{   
		this(1000.00);
		System.out.println("5");
	}
	Delhi1()
	{   
		this(875.22,20000);
		System.out.println("6");
	}

	
	public static void main(String[] args) {
	     new Delhi1();
        
	}

}
