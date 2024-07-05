package Package2;
class  Abc{
	static void cat() {
		System.out.println("i have cat");
	}
void rat() {
	System.out.println("i have a rat");
}
}
abstract class Xyz extends Abc{
	abstract void flage();
	static void pet() {
	System.out.println("i love flage");
	}
	void India() {
		System.out.println("i love india");
	}
}
abstract class Mno extends Xyz{
	abstract void add();
	void flage()
	{
		System.out.println("I have a flag");
	}
	void India()
	{
		System.out.println("I'm India");
	}
}
	

public class Gauri extends Mno {

	public static void main(String[] args) 
	{
	Gauri g=new Gauri();
	g.add();
	g.flage();
	}

	@Override
	void add() {
		System.out.println("I want to add something");
		super.flage();
		
	}
	void  flage()
	{
		//super.flage();
		System.out.println("I don't have any flage");
		super.flage();
	}

	
}



