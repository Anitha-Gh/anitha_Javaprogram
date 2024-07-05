package ab30;
class Bangalore
{
	Bangalore(int a)
	{
		System.out.println("Bangalore one");
	}

}
public class SuperCallingStatement extends Bangalore
{
	SuperCallingStatement()
	{   
		super(2000);//Explicitly super calling statement is present here.
		System.out.println("Bangalore two");
	}

	public static void main(String[] args) {
		 new SuperCallingStatement();

	}

}
