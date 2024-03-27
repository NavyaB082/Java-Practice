import java.util.Scanner;

public class EqualWIthoutUsingKeywords {

	public static void main(String[] args) {


		Scanner scan=new Scanner (System.in);
		System.out.println("enter the String1: ");
		String str1=scan.next();

		System.out.println("enter the String2: ");
		String str2=scan.next();
//		if(str1.length()==str2.length()) {
//			for(int i=0;i<=str1.length()-1;i++) {
//				if(str1.charAt(i)==str2.charAt(i)) {
//					System.out.println("Strings are equal.");
//				}
//				else {
//					System.out.println("Strings are not equal.");
//				}
//			}
//		}
//		else {
//			System.out.println("Strings are not equal.");
//		}
		
		boolean result=equal(str1,str2);
		if(result) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
		
	}
	
	public static boolean equal(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
