import java.util.Scanner;

public class OutsideToInsideStringPool {

	public static void main(String[] args) {
		
		String s1=new String("kodnest");
		System.out.println(s1);
		String s2=s1.intern();
		System.out.println(s2);
		
		if(s1==s2) {
			System.out.println("References are equal.");
		}
		else {
			System.out.println("references are not equal.");
		}
		
		
		if(s1.equals(s2)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal.");
		}
		
		//proof.
		
		String s3="kodnest";
		if(s3==s2) {
			System.out.println("References are equal.");
		}
		else {
			System.out.println("references are not equal.");
		}

	}

}
