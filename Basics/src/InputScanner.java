import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the byte value");
		byte x=scan.nextByte();
		System.out.println("the value of x:"+x);
		
		System.out.println("enter the float value");
		float y=scan.nextFloat();
		System.out.println("the value of y:"+y);
		
		System.out.println("enter the short value");
		short z=scan.nextShort();
		System.out.println("the value of z:"+z);
		
		System.out.println("enter the int value");
		int b=scan.nextInt();
		System.out.println("the value of a:"+b);
		
		System.out.println("enter the long value");
		long c=scan.nextLong();
		System.out.println("the value of c:"+c);
		
		System.out.println("enter the double value");
		double d=scan.nextDouble();
		System.out.println("the value of d:"+d);

		System.out.println("enter the boolean value");
		boolean e=scan.nextBoolean();
		System.out.println("the value of e:"+e);

		System.out.println("enter the String (one) value");
		String f=scan.next();
		System.out.println("the value of f:"+f);
		
		scan.nextLine();
		
		System.out.println("enter the STRING value");
		String g=scan.nextLine();
		System.out.println("the value of g:"+g);

	}

}
