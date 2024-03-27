package comparingTheString;

public class Equalsmethod {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
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
		
		System.out.println();
		
		String a="navya";
		String b=new String("navya");
		if(a==b) {
			System.out.println("References are equal.");
		}
		else {
			System.out.println("references are not equal.");
		}
		
		
		if(a.equals(b)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal.");
		}

	}

}
