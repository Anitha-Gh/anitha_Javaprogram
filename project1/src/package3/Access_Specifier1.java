package package3;//what  happens with in the package:we can call all access specifiers public,private,default,protected// 

public class Access_Specifier1 {
public static void add()
 {
	System.out.println("add");
	}
static void sub()
 {
	 System.out.println("sub");
 }
private static void mul()
{
	System.out.println("mul");
}
protected static void div()
{
	System.out.println("div");
}

	public static void main(String[] args) {
	   add();
	   sub();
	   mul();
	   div();
	
		// TODO Auto-generated method stub

	}

}
