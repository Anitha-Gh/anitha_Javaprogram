package package3;
class god
{
	void suni()
	{
		System.out.println("sunil");
	}
}
class woman extends god
{
	void ani()
	{
		System.out.println("anitha");
	}
}
 

public class Downcasting extends woman {
void pravee()
{
	System.out.println("praveen");
}
	public static void main(String[] args) {
	
           god g1 = new Downcasting ();//UPCASTING
                g1.suni();	
	    Downcasting d1 = (Downcasting) g1;//DOWNCASTING
	      d1.ani();    
	      d1.pravee();
	      d1.suni();
	}

}
