package Package2;

public class StaticMethod1 {
static void add()
{
	int a=10;
	int b=99;
	int c=a+b;
	System.out.println(c=a+b);
}
	public static void main(String[] args) {
	System.out.println("starting");
	add();
	System.out.println("ending");
	add();

	}

}
