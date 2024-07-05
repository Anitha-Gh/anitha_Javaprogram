package Package2;//method overriding program using super key word
class parent{
   void car()
   {
	System.out.println("i have suzuki");
   }}
 public class Child extends parent{
	 void car() { 
	 super.car();
	{ 
		System.out.println("i have toyoto");
	}}

	public static void main(String[] args) {
	    Child c1 = new Child();
	    c1.car();
	}}
 

