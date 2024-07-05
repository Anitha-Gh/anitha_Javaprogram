package Package2;

import java.util.Scanner;

public class Manish // scanner class arithmetic operation
{
	
	static int x;
	static int r;
	static int a;
	final double pi = 3.14;
	
	static void Triangle()
	{
		System.out.println("Enter the base of triangle");
		Scanner s5 = new Scanner(System.in);
		x = s5.nextInt();
		System.out.println("Enter the height of the triangle");
		r = s5.nextInt();
		int area = x*r/2;
		System.out.println("area of the triangle is"+area);
	}
	static void addition()
	{
		System.out.println("addition");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of x");       
		      x = s.nextInt();
		 System.out.println("enter the value of r");
		        r = s.nextInt();
		        a = x + r;
		  System.out.println(a);      
		  }
     static void subtraction()
     {
    	 System.out.println("subtraction");
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of x");       
		      x = s1.nextInt();
		 System.out.println("enter the value of r");
		        r = s1.nextInt();
		        a = x - r;
		  System.out.println(a);      
		  }
  
     static void multiplication()
     {
    	 System.out.println("multiplication");
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the value of x");       
		      x = s2.nextInt();
		 System.out.println("enter the value of r");
		        r = s2.nextInt();
		        a = x * r;
		  System.out.println(a);      
		  }
  
     static void division()
     {
    	 System.out.println("division");
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter the value of x");       
		      x = s3.nextInt();
		 System.out.println("enter the value of r");
		        r = s3.nextInt();
		        a = x / r;
		  System.out.println(a);      
		  }

     static void circle()
     {
    	 System.out.println("area of the circle");
		Scanner s4 = new Scanner(System.in);
		System.out.println("enter the value of pi");       
	     double pi= s4.nextDouble();
		System.out.println("enter the value of r");
		        r = s4.nextInt();
		  double  a = pi * r*r;
		  System.out.println(a);      
		  }
 
     
	public static void main(String[] args) {

		Triangle();
		addition();
		subtraction();
		multiplication();
		division();
		circle();
	}
}
