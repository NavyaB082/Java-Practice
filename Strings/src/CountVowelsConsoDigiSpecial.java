import java.util.Scanner;

public class CountVowelsConsoDigiSpecial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=scan.nextLine();
		
		int vowels=0;
		int consonents=0;
		int digits=0;
		int specialCharacters=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					vowels++;
				}
				else {
					consonents++;
				}
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				digits++;
			}
			else {
				specialCharacters++;
			}
		}
		System.out.println(vowels+" are vowels");
		System.out.println(consonents+" are consonents");
		System.out.println(digits+" are digits");
		System.out.println(specialCharacters+" are specialCharacters");

	}

}
