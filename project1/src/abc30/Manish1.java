package abc30;
abstract class Privacy
{
	abstract void username();
	abstract void password();

     void tc()
 {
	 System.out.println("addition");
 }}
public class Manish1 extends Privacy
{
	void username()
	{ 
		System.out.println("username");
	}
	void password()
	{
		System.out.println("subtraction");
    }
  
	public static void main(String[] args) {
		
		Manish1 m1 = new Manish1();
		   m1.username();
		   m1.password();
		   m1.tc();
		   }}
	
	

	
		
		


	


