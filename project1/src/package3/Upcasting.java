package package3;

class one
{
	void add()
	{
		System.out.println("addition");
}}
public class Upcasting extends one {
    void sub()
    {
    	System.out.println("subtraction");
    }
	public static void main(String[] args) {

            one o1  = new Upcasting();//UPCASTING
                o1.add();
             Upcasting u1=(Upcasting) o1; //DOWNCASTING
             u1.add();
             u1.sub();
	}

}
