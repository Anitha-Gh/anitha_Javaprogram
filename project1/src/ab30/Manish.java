package ab30;//abstract class is having abstract methods in this program//
abstract class privacy
{ 
	abstract void username();
	abstract void password();

void tc()
{
	System.out.println("addition");
}}
public class Manish extends privacy
{
 void username() 
 {
	 System.out.println("username");
 }
 void password() 
 {
	 System.out.println("password");
 }
	
	public static void main(String[] arg)
	{
	
		Manish m1 = new Manish();
				m1.username();
	            m1.password();
	            m1.tc();	
	}}


