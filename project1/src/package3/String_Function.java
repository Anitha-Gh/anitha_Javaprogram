package package3;

public class String_Function {

	public static void main(String[] args) {
		String a = "india";
		String b = "manish";
		String c =("   my name is anitha   ");
		System.out.println(a.length());
        System.out.println(a.concat(" is my country"));
        System.out.println(a.charAt(1));
        System.out.println(a.indexOf("i"));
        System.out.println(a.substring(3));
        System.out.println(a.substring(1,4));
        System.out.println(b.concat(a));
        String d = ("  my name is mkt   ");
        System.out.println(c.trim());
        System.out.println(d.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.matches(c));
        System.out.println(a.contains(a));
}}
