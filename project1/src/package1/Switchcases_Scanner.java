package package1;

import java.util.Scanner;

public class Switchcases_Scanner {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the valu of a");
		int a=s1.nextInt();
		System.out.println("enter the value of b");
        int b=s1.nextInt();
        System.out.println("enter the value of s");
        float s=s1.nextInt();
        System.out.println("enter the value of q");
        float q=s1.nextFloat();
        System.out.println("enter the value of c");
        int c=s1.nextInt();
        switch (c)
        {
        case 1:
        	int d=a+b;
        	System.out.println("addition of two numbers is" + d);
        	break;
        case 2:
        	int f=a-b;
        	System.out.println("subtraction of two numbers is" +f);
        	break;
        case 3:
        	int k=a*b;
        	System.out.println("multiplication of two numbers is"+k);
        	break;
        case 4:
        	float m = s/q;
        	System.out.println("division of two numbers is" +m);
        	break;
        case 5:
        	if( a<b)
        	{		
        		System.out.println("india");
        	}
        	else
        	{
        		System.out.println("pakistan");
        	}
        	break;
        	default:
        		System.out.println("switch case not present in the program");
        	
        	
        }
	}

}
