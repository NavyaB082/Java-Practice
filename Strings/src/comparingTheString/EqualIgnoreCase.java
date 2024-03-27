package comparingTheString;

public class EqualIgnoreCase {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("JAVA");
		
		//comparing the reference
		if(s1==s2) {
			System.out.println("References are equal.");
		}
		else {
			System.out.println("references are not equal.");
		}
		
		//comparing the values
		if(s1.equals(s2)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal.");
		}
		
		//equal-ignore
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal.");
		}

	}

}
