import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the String1: ");
		String str=scan.next();

		frequency(str);
	}
	
	public static void frequency(String str) {
		int [] frequency=new int [256];
	
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			frequency[ch]++;
		}
		
		for(int i=0;i<256;i++) {
			if(frequency[i]>0) {
				char ch=(char)i;
				System.out.println("character:"+ch+" frequency:"+frequency[i]);
			}
		}
		
	}

}
