package ab30;
interface Women
{
	void english();
	void kannada();
	
}
interface Girl extends Women
{
	void science();
	void social();
}
public class Interface_Case_3 implements Girl
{
     static void maths()
     {
    	 System.out.println("I love maths");
     }
	 void civics()
	 {
		 System.out.println("I hate civics");
	 }
	 public void english() 
		{
			System.out.println("english");
			
		}
		
	 public void kannada() 
		{
			System.out.println("kannada");
			
		}
		
	 public void science() 
		{
			System.out.println("science");
			
		}
		
	 public void social() 
		{
			System.out.println("social");
			
		}
	 public static void main(String[] args) {
	
		Interface_Case_3 i1=new Interface_Case_3();
	     maths();
	     i1.civics();
	     i1.english();
	     i1.kannada();
	     i1.science();
	     i1.social();
	}}
