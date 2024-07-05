package ab30;

public class StringFunction {

	public static void main(String[] args) {
	  
		String s1="India";
		String s2 = "manish";
		s1.length();
	    System.out.println(s1.length());
		System.out.println(s2.length());
       // int s = s1.length();//return typeof lenght is int so we are storing in int s,
	   //we can do in 2ways first is line no.9 and 10 and second is 12 and 14.Both are same.
	   // System.out.println(s);
		s1.toUpperCase();
		System.out.println(s1.toUpperCase());
		s1.toLowerCase();
		System.out.println(s1.toLowerCase());
		 String s3="   manish  " ;
		 s3.trim();
		 System.out.println(s3.trim());
		 s1.charAt(3);
		 System.out.println(s1.charAt(3));
		 s1.indexOf('a');
		 System.out.println(s1.indexOf('a'));
		 s1.substring(3);
		 System.out.println(s1.substring(3));
		 s1.substring(0,4);
		 System.out.println(s1.substring(0,4));
		 
		 
	}

}
