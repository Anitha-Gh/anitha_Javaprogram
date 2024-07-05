package Package2;

public class Logical_Operators {
    static void and()
    {  int a=10;
        int b=99;
     if (a>b && b>10)
     {
    	 System.out.println("and operator");
     }}
    static void or()
    { int a=10;
      int b=99;
     if (a<b || b<20)
      {
    	  System.out.println("i am or operator");
      }}
    static void andnot()
    { int a=10;
      int b=99;
    if(!(a<b && b<a))
    {
    	System.out.println( "i am notand operator");
    }}
   static void ornot() 
   {
	   int a=10;
	   int b=99;
	   if (!(a>b || (b>a)))
	   {
		   System.out.println("i am notor operator");
	   }}
   
    public static void main(String[] args) {
		and();
		or();
		andnot();
		ornot();

	}

}
