
public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("BINARY OPERATORS");
		
		//Arithmetic operators
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(a%b);
		System.out.println();
		
		//Relational operators or conditional operators
		System.out.println(a==b);
		System.out.println(b!=a);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println();
		
		//logical operators
		System.out.println(true&&true);
		System.out.println(true&& false);
		
		System.out.println(true||true);
		System.out.println(true|| false);
		
		System.out.println(false&&false);
		System.out.println(false|| false);
		System.out.println();
		
		System.out.println("UNARY OPERATORS");
		//Incremental and decrement operators
		
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		System.out.println();
		
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		System.out.println();
		
		b=++a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		b=--a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		b=a++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		b=a--;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		//programs to predict output
		int c=5;
		int d;
//		d=++c + ++c;
//		System.out.println(c);
//		System.out.println(d);
		
		System.out.println();
		
//		d=++c + ++c + c++;
//		System.out.println(c);
//		System.out.println(d);
		
//		d=c++ + c++;
//		System.out.println(c);
//		System.out.println(d);
		
		d=++c + ++c + c++ + c++ + --c + c--;
		System.out.println(c);
		System.out.println(d);

	}

}
