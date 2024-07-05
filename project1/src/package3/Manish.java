//This key word is used when the Global variable and the parameters of the method are same// 
package package3;
public class Manish {
  int a;
  double b;
  String c;
	void anitha(int a,double b,String c)
	{
	 System.out.println("Hi");
	 this.a = a;
	 this.b = b;
	 this.c = c;
	 }
	public static void main(String[] args)
	{
		Manish m1=new Manish();
        m1.anitha(11,2.1,"praveen");
        System.out.println(m1.a);
	    System.out.println(m1.b);
	    System.out.println(m1.c);
	}

	
}
