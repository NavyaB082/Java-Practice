import java.util.Scanner;

public class InbultMethods {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the value of the String: ");
		String st=scan.nextLine();

		System.out.println("the string which have entered is: "+st);
		
		System.out.println("the length of the string is:"+st.length());
		
		System.out.println("the uppercase of the String entered is:"+st.toUpperCase());
		
		System.out.println("the lowercase of the String entered is:"+st.toLowerCase());
		
		System.out.println("the string is empty:"+st.isEmpty());
		
		System.out.println("the charcter at the position 3 is:"+st.charAt(3));
		
		System.out.println("the index of the character N is:"+st.indexOf('N'));
		
		System.out.println("the lastindex of the character e is:"+st.indexOf('e'));
		
		System.out.println("the string contains 'nest' word:"+st.contains("nest"));
		
		System.out.println("the string startwith 'Kod':"+st.startsWith("Kod"));
		
		System.out.println("the string ends with 'Ltd':"+st.endsWith("Ltd"));
		
		System.out.println("the substring of the string :"+st.substring(8));
		
		System.out.println("the substring of the string :"+st.substring(8,12));
		
		System.out.println("replace e with x:"+st.replace('e', 'x'));
		
		System.out.println("replace a whole word :"+st.replaceAll("Technologies", "Companies"));
		
		System.out.println("Index of "+st.indexOf('z'));//-1
	}

}
