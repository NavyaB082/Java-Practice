import java.util.Scanner;

public class CapitaliseEachWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=scan.nextLine();
		
		
		String result=capitalise(str);
		System.out.println(result);
	}
	public static String capitalise(String str) {
		String[] newstr=str.split(" ");
		StringBuilder formatSentence=new StringBuilder();
		for(String word:newstr) {
			if(!word.isEmpty()) {
			char firstletter=Character.toUpperCase(word.charAt(0));
			String restwords=word.substring(1).toLowerCase();
			formatSentence.append(firstletter).append(restwords+" ");
			}
			
		}
		
		
		return new String(formatSentence);
		
	}

}
