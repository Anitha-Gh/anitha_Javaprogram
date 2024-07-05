package basic_program_ab42;
class login
{
	void login()
	{
		System.out.println("i am login with emailid");
	}
}
public class Method_overridding extends  login 
{
	void login()
	{
		System.out.println("i am login with phone no.");
	}
  public static void main(String[] args) {
	  Method_overridding m1 = new Method_overridding();
	  m1.login();
	}

}
