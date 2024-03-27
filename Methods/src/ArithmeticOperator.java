import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter second number");
		int num2=scan.nextInt();
		
		int res=add(num1,num2);
		System.out.println("adddition "+res);
		int res1=sub(num1,num2);
		System.out.println("Subtraction "+res1);
		int res2=mul(num1,num2);
		System.out.println("Multiplication "+res2);
		int res3=div(num1,num2);
		System.out.println("divition "+res3);
		int res4=rem(num1,num2);
		System.out.println("remainder "+res4);

	}
	public static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	
	public static int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	
	public static int div(int a,int b) {
		int c=a/b;
		return c;
	}
	
	public static int rem(int a,int b) {
		int c=a%b;
		return c;
	}

}
