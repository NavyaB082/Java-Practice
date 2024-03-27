
public class TypeCasting {

	public static void main(String[] args) {
		// The process of converting one DataType to another DataType is know as type casting.
		
		//Implicit Type Casting
		//The process of converting smaller Data type to larger Data type.
		
		System.out.println("IMPLICIT");
		byte x=25;
		int y;
		y=x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();
		
		short a=3547;
		double b;
		b=a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		System.out.println("EXPLICIT");
		//Explicit Type  Casting
		//The process of converting the larger data type to smaller data type.
		
		int c=73;
		byte d;
		d=(byte)c;
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println();
		
		
		double e=22.27;
		short f;
		f=(short)e;
		System.out.println(e);
		System.out.println(f);
		
		
		System.out.println();
		
		float g=78.42F;
		System.out.println(g);

	}

}
