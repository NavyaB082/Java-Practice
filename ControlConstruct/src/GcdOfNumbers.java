import java.util.Scanner;

public class GcdOfNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int m=scan.nextInt();
		
		System.out.println("enter the second number.");
		int n=scan.nextInt();
		
		
		int rem;
		while(n!=0) {
			rem=m%n;
			m=n;
			n=rem;
		}
		
		System.out.println("the GCD of numbers is "+m);

	}

}
