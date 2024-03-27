package loopingControlConstructs;

import java.util.Scanner; 

public class Tables {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("enter the number for which you need the table.");
		int num=scan.nextInt();
		for(int i=0;i<=10;i++) {
			int result=num*i;
			System.out.println(num+" "+"*"+" "+i+" "+"="+" "+result);
		}
		
		
		
		
		//to find the power of a number.
	
		System.out.println("enter the power for the number.");
		int power=scan.nextInt();
		double ans=Math.pow(num, power);
		System.out.println(ans);

		
		
		scan.close();
	}

}
