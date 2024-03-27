package selectionControlConstructs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("enter the first number :");
		int num1=scan.nextInt();
		
		System.out.println("enter the second number :");
		int num2=scan.nextInt();
		
		System.out.println("enter the symbol to perform an operation :");
		char ch=scan.next().charAt(0);
		
		switch(ch) {
		case '+': 
			System.out.println("the addition result is "+(num1+num2));
			break;
			
		case '-':
			if (num1>num2) {
				System.out.println("the subtraction result is "+(num1-num2));
			}
			else {
				System.out.println("the subtraction result is "+(num2-num1));
			}
			break;
			
		case '*':
			System.out.println("the multiplication result is "+(num1*num2));
			break;
			
		case '/':
			System.out.println("the division result is "+(num1/num2));
			break;
		
		case '%':
			System.out.println("the reminder result is "+(num1%num2));
			break;
			
		default:System.out.println("enter the valid symbol");
			
			
		}
		
		scan.close();

	}

}
