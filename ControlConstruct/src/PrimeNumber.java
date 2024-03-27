import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=scan.nextInt();
		
		if(num==2) {
			System.out.println(num+" is a prime number");
		}
		else {
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					System.out.println(num+" is not prime number");
					break;
				}
				else {
					System.out.println(num+" is a prime number");
					break;
				}
			}
		}	

	}

}
