package basic_program_ab42;

 class mysore
   {
      mysore()
   {
	System.out.println("i am in mysore");
   }}
 class delhi extends mysore
   {  
     delhi() 
     {
	 System.out.println("i am in delhi");
     }
    }
 class bangalore extends delhi
   {  
	  bangalore()
	{
		 System.out.println("i am in bangalore");
	}
   }
 public class Super_Calling_Statement1 extends bangalore {
	 Super_Calling_Statement1()
	 
    {  
    	System.out.println("i am super calling statement");
    }
	public static void main(String[] args) {
	
		Super_Calling_Statement1 s1 =new Super_Calling_Statement1();
		                
	}

}
