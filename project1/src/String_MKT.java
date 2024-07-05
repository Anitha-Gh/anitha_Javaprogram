
public class String_MKT {

	public static void main(String[] args) {
		String a = "MANISH KUMAR TIWARI";
		String b = (a.substring(0, 1)).concat((a.substring(7, 8)) + (a.substring(13, 14)));

		System.out.println(b);

		String c = "ANITHA GOWDA";
		String d = (c.substring(0, 1)).concat((c.substring(7, 8)));
		System.out.println(d);
		String e = "PRAVEEN GOWDA";
		String f = (e.substring(0, 1)).concat(e.substring(8, 9));
		System.out.println(f);
		String g = "SUNIL GOWDA";
		String h = (g.substring(0, 1)).concat(g.substring(6, 7));
		System.out.println(h);
	}

}
