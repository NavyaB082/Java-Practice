import java.util.Scanner;

public class GeneratePosiibleSubString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string: ");
		
		String str=scan.nextLine();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String subString=str.substring(i,j);
				System.out.println(subString);
			}
		}

	}

}
