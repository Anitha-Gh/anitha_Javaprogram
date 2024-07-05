package Package2;
 class upi
{
	static void add()
	{
	System.out.println("i am upi");
	}
}
class atm extends upi
{ static void sub()
{
	System.out.println ("i am atm");
}}
public class Multi_Level_Inheritance extends atm {
	static void mul()
	{
    System.out.println("i am child class");
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
	}
}


