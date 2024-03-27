import java.util.Scanner;

public class Program1Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many times you need :");
		int n=scan.nextInt();
		fun(n);

	}
	public static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println("Students are having fun.");
		fun(n-1);
		
	}

}
