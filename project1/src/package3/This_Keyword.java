package package3;
//This key
public class This_Keyword {
	int a;
	double b;
	String C;
	void name(int a,double b,String c)
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println("starting");
		This_Keyword t1=new This_Keyword();
		t1.name(10,8.1,"anitha");
       System.out.println(t1.a);
       System.out.println(t1.b);
       System.out.println(t1.C);
       }
}
