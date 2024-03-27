import java.util.Scanner;

public class IndexOfString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the string:");
		String str=scan.nextLine();
		
		System.out.println("enter the index: ");
		int i=scan.nextInt();
		
		char ch=findchar(str,i);
		System.out.println("the character of the entered index "+i+" is "+ch);
		
		
	}
	public static char findchar(String str,int i) {
		char ch=str.charAt(i);
		return ch;
	}

}
