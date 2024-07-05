package package1;//constructor with parameter and super calling statement 
class Two3
{
	Two3(int a)
		{
			System.out.println("3");
		}}
  class Two2 extends Two3{
		Two2(String a,char b) {
		super(-90);
		System.out.println("2");
	}}
  class Two1 extends Two2
	{
	Two1(){
	super("mkt",'l');
	System.out.println("1");
	}}
	public class Two {
	 
		public static void main(String[] args) {
	 System.out.println("starting");
     new Two1();
	 System.out.println("ending");
		}}
