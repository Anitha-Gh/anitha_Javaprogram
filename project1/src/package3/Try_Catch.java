package package3;

public class Try_Catch {

	public static void main(String[] args) {
		int salary [] = new int [2];
		String[] s = new String[2]; 
		salary [0] = 1000;
		salary [1] = 2000;
		 String S = "praveen";  
		 String p = "sunil";
		try
		  {
		  salary [2] = 3000;
		  }
		  catch (ArrayIndexOutOfBoundsException anitha)
		  {
			  System.out.println("this exception is handled");
		  }
         
		for (int i=0;i<2;i++)
	
{
			System.out.println(salary[i]);
}

	}}		 
   
	
	

	



