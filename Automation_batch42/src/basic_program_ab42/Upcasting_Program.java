package basic_program_ab42;
class Del
{
	static void flight()
	{
		System.out.println("Delhi by flight");
	}
	 static void car()
	{
		System.out.println("Delhi by car ");
	}
}
public class Upcasting_Program extends Del {
    void Bike()
    {
    	System.out.println("Going to delhi by Bike");
    }
	
	public static void main(String[] args) {
		
		       Del d1 	 = new Upcasting_Program();//here converting child class object to a super class type
				     d1.car();
				     d1.flight();
	}

}
