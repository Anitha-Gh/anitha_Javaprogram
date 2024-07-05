package Package2;

public class Sib_Iib {
    static
    {
    	System.out.println("first static method");
    }
    {
    	System.out.println("second iib method");
    }
    {
    	System.out.println( "third iib method"); 
	}
    public static void main(String[] args) {
  
     System.out.println("main method");
	      new Sib_Iib();
	     
    }

}
