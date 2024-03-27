import java.util.Scanner;

public class ConcatenationThreeString {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the String1: ");
		String str1=scan.next();

		System.out.println("enter the String2: ");
		String str2=scan.next();

		System.out.println("enter the String3: ");
		String str3=scan.next();
		
		String newString=newstr(str1,str2,str3);
		System.out.println(newString);
			
		
	}

	public static String newstr(String str1,String str2,String str3) {
		int totalLength=str1.length()+str2.length()+str3.length();
		char []result=new char[totalLength];
		int currentIndex=0;
		
		for(int i=0;i<=str1.length()-1;i++) {
			result[currentIndex]=str1.charAt(i);
			currentIndex++;
		}
		
		for(int i=0;i<=str2.length()-1;i++) {
			result[currentIndex]=str2.charAt(i);
			currentIndex++;
		}
		
		for(int i=0;i<=str3.length()-1;i++) {
			result[currentIndex]=str3.charAt(i);
			currentIndex++;
		}
		
		return new String(result);
	}
}
