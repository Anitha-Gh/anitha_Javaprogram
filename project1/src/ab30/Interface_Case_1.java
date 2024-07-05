package ab30;
interface Stu
	 {
    	void exam1();
    	void exam2();
     }

  public class Interface_Case_1 implements Stu
	{
	public void exam1() 
	    {
		System.out.println("result");	
		
		}
	public void exam2() 
		{
		System.out.println("pass");
		}
	
	public static void main(String[] args) {
		
		Interface_Case_1 i1 = new Interface_Case_1();
		          i1.exam1();
		          i1.exam2();
	}}
	
	


