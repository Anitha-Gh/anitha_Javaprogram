package basic_program_ab42;

	public class Method_overloading{
	static void add(int a) 
	{
		int sum = a+10;
		 System.out.println(sum);
			
		}
	static void add(int b,int c) 
	{
		int sum1 = b+c+10;
		 System.out.println(sum1);
			
	}
    static void add(boolean t ) 
	{
	   System.out.println(true);
			
	}

    static void add(char k) 
    {
    	
    	System.out.println("i am char");
    }
    static void add(String k) 
    {
    	
    	System.out.println("i am string");
    }
   public static void main(String[] args) {
	
		add(100);
		add(200,300);
		add(true);
		add('A');
		add("anitha");
		
	
}}

