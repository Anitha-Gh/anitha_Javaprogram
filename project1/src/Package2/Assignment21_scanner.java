package Package2;

import java.util.Scanner;

public class Assignment21_scanner {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = a + b;
        System.out.println(c);
        int d = a - b;
        System.out.println(d);
        int e = a/b;
        System.out.println(e);
        int f = a*b;
        System.out.println(f);
        int r = s1.nextInt();
        double pie = s1.nextDouble();
        double area = pie*r*r;
        System.out.println("area of a circle=");
        System.out.println(area);
        int length=s1.nextInt();
        int breadth=s1.nextInt();
        int area1 = length * breadth;
        System.out.println("area of rectangle is");
        System.out.println(area1);
	}

	}


