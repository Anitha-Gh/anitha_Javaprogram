package Package2;

public class Constructor_Overloading {
     Constructor_Overloading()
     {
    	 System.out.println("nothing");
    	 
     }
     Constructor_Overloading (int a,int b)
     {
    	System.out.println("adding"); 
     }
     Constructor_Overloading(double s)
     {
     System.out.println("substraction");
     }  
     
	public static void main(String[] args) {
	   System.out.println("main method");
	   new Constructor_Overloading();
	   new Constructor_Overloading(20,30);
	   new Constructor_Overloading(3.14);
	   

	}

}
