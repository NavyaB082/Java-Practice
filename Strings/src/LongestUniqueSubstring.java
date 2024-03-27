import java.util.Scanner;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String: ");
		String str=scan.nextLine();
		
		String result= longest(str);
		System.out.println(result);

	}
	public static String longest(String str) {
		
		int maxlength=0;
		String longestSubstring="";
		for(int i=0;i<=str.length()-1;i++) {
			StringBuilder newstr=new StringBuilder();
			for(int j=0;j<=str.length()-1;j++) {
				char currentstr=str.charAt(j);
				if(newstr.toString().contains(String.valueOf(currentstr))) {
					continue;
				}
				
				newstr.append(currentstr);
			
				
			}
			if(newstr.length()>maxlength) {
				maxlength=newstr.length();
				longestSubstring=newstr.toString();
			}
		}
		return longestSubstring;
		
	}
	

}
