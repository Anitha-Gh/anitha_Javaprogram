package basic_program_ab42;

import java.util.Scanner;

public class Scaner_Class_Program {
	 static Scanner s1 = new Scanner(System.in);
	static void add()
	{
    System.out.println("Enter the value of a");
    int a = s1.nextInt();
    System.out.println("Enter the value of b");
    int b = s1.nextInt();
    int c = a+b;
    System.out.println("addition of 2 no" +c);
	}
	static void sub()
	{
    System.out.println("Enter the value of a");
    int a = s1.nextInt();
    System.out.println("Enter the value of b");
    int b = s1.nextInt();
    int c1 = a-b;
    System.out.println("subtraction of 2numbers "+c1);}
	static void mul()
	{
    System.out.println("Enter the value of a");
    int a = s1.nextInt();
    System.out.println("Enter the value of b");
    int b = s1.nextInt();
    int c2 = a/b;
    System.out.println("multiplication of 2no." +c2);}
	static void div()
	{
    System.out.println("Enter the value of a");
    int a = s1.nextInt();
    System.out.println("Enter the value of b");
    int b = s1.nextInt();
    int c3 = a/b;
    System.out.println("Division of 2no." +c3);}
	static void modulus()
	{
    System.out.println("Enter the value of a");
    int a = s1.nextInt();
    System.out.println("Enter the value of b");
    int b = s1.nextInt();
    int c4 = a/b;
    System.out.println("Modulus" +c4);}
	
   public static void main(String[] args) {
	    add();
		sub();
		mul();
		div();
		modulus();
		
}}
