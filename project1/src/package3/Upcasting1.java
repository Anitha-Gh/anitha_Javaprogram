package package3;
class abc 
{
	void add()
	{
		System.out.println("add");
	}
}
class xyz extends abc
{
	void sub()
	{
		System.out.println("sub");
	}
}
public class Upcasting1 extends xyz {
void mul()
{
	System.out.println("mul");
}
	
	public static void main(String[] args) {
	     abc a1  = new xyz();//UPCASTING
            a1.add();
         xyz x1 = (xyz) a1;
         x1.add();
         x1.sub();
	} }