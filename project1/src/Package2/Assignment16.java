package Package2;

public class Assignment16 {
 static void add()
 {
	 System.out.println("i am static void method");
 }
 void add(int c) 
	 {	 System.out. println ("i am non static method");
 }
 Assignment16()
		 {System.out.println("i am construter ");
		 }
 
 static
 {
	 System.out.println("i am static method");
 }
 // This is iib
 {
	 System.out.println("i am iib");
 }
 
 public static void main(String[] args) {
	System.out.println("main method");
		Assignment16 A1=new Assignment16();
	         A1.add(20);	
             add();
	}

}
