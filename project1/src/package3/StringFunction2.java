package package3;

public class StringFunction2 {

	public static void main(String[] args) {
		
      String a = ("MANISH KUMAR TIWARI");
      
   String b = a.substring(0, 6);
   System.out.println(b);
   
   String c = a.substring(13).toLowerCase();
   System.out.println(c);
   System.out.println(b.concat(c));
   System.out.println(b+c);
   System.out.println(a.charAt(7)+a.substring(8, 12).toLowerCase()+" "+a.charAt(0)+a.substring(1,6 ).toLowerCase() );
   
}}