import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string1:");
		String str1=scan.nextLine();
		
		System.out.println("enter the string2");
		String str2=scan.nextLine();
		
		boolean result=checkAnagram(str1,str2);
		
		if(result) {
			System.out.println("the string is Anagram.");
		}
		else {
			System.out.println("the string is not Anagram.");
		}
		

	}
	public static boolean checkAnagram(String str1,String str2) {
		str1=str1.replaceAll("//s","").toLowerCase();
		str2=str2.replaceAll("//s","").toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[]ch1=str1.toCharArray();
		char[]ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}


	

}
