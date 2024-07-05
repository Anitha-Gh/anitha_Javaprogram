package ab30;

interface Third
{
	 void locators();
	 void xpath();
}
abstract class Second implements Third
{
	abstract void text();
	abstract void text1();
	static void add()
	{
		System.out.println("I love India");
	}
	static void add1()
	{
		System.out.println("I love Karnataka");
	}
}

public class Interface_Case2 extends Second {

	public static void main(String[] args) {
		
		Interface_Case2 int1 = new Interface_Case2();
		add();
		add1();
		int1.text();
		int1.text1();
		int1.locators();
		int1.xpath();
	}

	public void locators() {
		System.out.println("1");
		
	}

	
	public void xpath() {
	
		System.out.println("2");
	}

	void text() {
	
		System.out.println("3");
	}

	void text1() {
		
		System.out.println("4");
	}

}
