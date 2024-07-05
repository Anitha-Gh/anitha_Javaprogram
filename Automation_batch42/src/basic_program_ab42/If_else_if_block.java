package basic_program_ab42;

public class If_else_if_block {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		if (a<b) {
			System.out.println("if block is wrong");
			}
		else if (a>b) {
			System.out.println("else if block is right");
		}
		else if (a==b)
		{ 
			System.out.println("i am 100");
		}
		else if (a!=b)
		{
			System.out.println("this block is true");
		}
		else if (b<a)
		{
			System.out.println("this else if block is also correct");
		}
		else
		{ 
			System.out.println("i am else block");
		}
	}

}
