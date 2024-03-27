import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the string:");
		 String str=scan.nextLine();
		 
		 boolean result=checkPalindrome(str);
		 if(result) {
			 System.out.println("yes,it is a palindrome.");
		 }
		 else {
			 System.out.println("it is not a palindrome.");
		 }

	}
	public static boolean checkPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
		left++;
		right--;
		}
		return true;
	}

}
