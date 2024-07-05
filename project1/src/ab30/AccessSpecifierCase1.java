package ab30;

public class AccessSpecifierCase1 {
  public  void add()
  {
	 System.out.println("1"); 
  }
  private static void sub()
  { 
	 System.out.println("2");
  }
   void mul()
   {
	   System.out.println("3");
   }
  protected static void div()
   {
	   System.out.println("4");
   }
   public AccessSpecifierCase1()
   {
	   System.out.println("5");
	   }
   
	public static void main(String[] args) {
		AccessSpecifierCase1 a1 = new AccessSpecifierCase1();
		a1.add();
		a1.mul();
	     sub();
	     div();
	}

	
	}


