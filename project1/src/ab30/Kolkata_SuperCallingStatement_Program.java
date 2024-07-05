package ab30;//Super calling statement program(Implicitly present in line no.12)
class Hassan
{
	Hassan()
	{
		System.out.println("my native is hassan");
	}
}
class mumbai extends Hassan
{
	mumbai()
	{  //Here super calling statement implicitly present.
		System.out.println("i am in mumbai");
	}
}
public class Kolkata_SuperCallingStatement_Program {

	public static void main(String[] args) {
	
		new mumbai();
	}

}
