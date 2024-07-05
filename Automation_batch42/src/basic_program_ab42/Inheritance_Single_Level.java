package basic_program_ab42;



    class child
    {
    static void chidclass()
    {
	System.out.println("I am child class");
    }}
    public class Inheritance_Single_Level extends child {
	static void parentclass()
	{
		System.out.println("I am child parentclass");
	}
	public static void main(String[] args) {
	
           parentclass();
	}

}
