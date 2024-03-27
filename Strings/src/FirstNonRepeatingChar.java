import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scan.nextLine();
		
		char result=nonRepeat(str);
		if(result!='\0') {
			System.out.println("the first non repeating character is "+result);
		}
		else {
			System.out.println("no,non repeating character.");
		}

	}
	public static char  nonRepeat(String str) {
		int []charcount=new int[256];
		//count the occurence of each character
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			charcount[c]++;
		}
		//find the first character with count1
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			if(charcount[c]==1) {
				return c;
			}
		}
		return'\0';
	}

}
