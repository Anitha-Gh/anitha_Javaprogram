package basic_program_ab42;

public class Reversing_String {

	public static void main(String[] args) {
		String input="Madam";
		String input1=input.toLowerCase();
		System.out.println(input1);
		
		String output="";
		for(int i=input1.length()-1;i>=0;i-- )
		{
		char reverse=input1.charAt(i);// for locating the letters in reverse order
		output=output+reverse;// original output given in line 7 + value of reverse given in line 10
		}
		System.out.println(output); 
		if(output.equals(input1))//equalsIgnoreCase
		{
		System.out.println("Pallindrome");
		}
		else {
		System.out.println("not Pallindrome");
		}

	}

}
