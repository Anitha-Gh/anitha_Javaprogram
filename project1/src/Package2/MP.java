package Package2;
class India 
{
	static void flage() {
		System.out.println("my flage");
	}
	void dance() {
		System.out.println("i am dancer");
	}}
abstract class Ap extends India {
	abstract void cat();
	abstract void dog();}
abstract class Up extends Ap{
	abstract void rat();
	abstract void pet()	;	
	}
public class MP extends Up {
	void rat() 
	{
	 System.out.println("rat");
	} 
	void pet() 
	{
		System.out.println("pet");
	}
 
	public static void main(String[] args) {
		flage();
		MP m1=new MP();
           m1.dance();
           m1.cat();
           m1.cat();
           m1.dog();
           m1.dog();}
           
    void cat() {
		System.out.println("i am having cat");
	}
    void dog() {
		System.out.println("i am having dog");
		}
}
