package hybridlevelinheritanc;



 class years extends days
{
      static void october()
{
	System.out.println("This is october ");
}}
   class days {
	   
		   static void monday()
		   { System.out.println("This is monday");}
	   }
  class week extends  days {
	
		static void week()
		{
			System.out.println("one week");
		}
	}
  public class Month extends week
   
  {static void Month()
	{
	 System.out.println("january");
	}


 public static void main(String[] args) {
	
	 monday();
	 week();
	 Month();}
	 
	 
 }
  
 