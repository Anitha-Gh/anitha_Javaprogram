package Package2;

public class Assignment17
{
 static void add()
{
	 System.out.println("non parameter static method");
}
  static void add(int a)
 {
	  System.out.println("parameter static method");
 }
	
 void sub(int a,int b)
 {
	 System.out.println ("non static with parameter method");
 }
void sub()
{ 
	System.out.println("non static and non parameter");
}
Assignment17()
{ 
	System.out.println("i am constructor");
}
static
{
	System.out.println("i am sib method");
}
{
    System.out.println("iib");
}
public static void main(String[] args) 
{
    System.out.println("main method");
    Assignment17 A1=new Assignment17();
    		A1.sub();
            A1.sub(2,5);
            add();
            add(5);}}


