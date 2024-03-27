package comparingTheString;



public class FourTypes {

	public static void main(String[] args) {
	
		//==  method
		//equals() method
		//equalsIgnore Method
		//Compare To method

//		using first immutable type
		//1.== and equals()
		
		String s1="java";
		String s2="java";
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
		
	}

}
