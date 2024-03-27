package loopingControlConstructs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the range to be firsted : ");
		int a=scan.nextInt();
		
		System.out.println("enter the range to be ended : ");
		int b=scan.nextInt();
		
		//for-loop
		
//		for(int i=a;i<=b;i++) {
//			if(i%2==0) {
//				System.out.println(i+"-even");
//			}
//			else {
//				System.out.println(i+"-odd");
//			}
//		}
		
		//while-loop
		
//		int i=a;
//		while(i<=b) {
//			if(i%2==0) {
//			System.out.println(i+"-even");
//			}
//			else {
//				System.out.println(i+"-odd");
//			}
//			i++;
//		}
		
		//do-while loop
		
		int i=a;
		do {
			if(i%2==0) {
				System.out.println(i+"-even ");
			}
			else {
				System.out.println(i+"-odd");
			}
			i++;
		}
		while(i<=b);
		
		scan.close();

	}

}
