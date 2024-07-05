package basic_program_ab42;

class car
{
	void car()
	{
		System.out.println("i am having car");
	}
}

public class Super_Keyword extends car {
	void car()
	{
		super.car();
		System.out.println("i am having bike");
	}

	public static void main(String[] args) {
	
		Super_Keyword s1 = new Super_Keyword();
		      s1.car();
	}

}
