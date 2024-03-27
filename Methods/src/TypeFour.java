import java.util.Scanner;

public class TypeFour {

	public static void main(String[] args) {
		// The methods which take input and return output.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numerator");
		double a=scan.nextDouble();
		
		System.out.println("Enter denominator");
		double b=scan.nextDouble();
		
		double res=div(a,b);
		System.out.println(res);
		

	}
	
	public static double div(double a,double b) {
		double c=a/b;
		return c;
	}

	
}
