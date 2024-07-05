package basic_program_ab42;


public class Math_Class_Program {

	public static void main(String[] args) {
		System.out.println(Math.addExact(150,200));
		System.out.println(Math.subtractExact(500,200));
		System.out.println(Math.multiplyExact(25,5));
		System.out.println(Math.max(123.3, 100.0));
		System.out.println(Math.max(1000,500));
        System.out.println(Math.min(15,5));
        System.out.println(Math.min(15.3,555.33));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.random());//Math.random will always gives unique value//
        System.out.println(Math.random());//return type of Math.random is double//
        double r2 = Math.random();
        double d1= Math.PI;
        double g = d1*r2*r2;
        System.out.println(g);
        
        double d= Math.PI;
        System.out.println(d);
        int r = 100;
        double a = d*r*r;
       System.out.println(a);
	}

}
