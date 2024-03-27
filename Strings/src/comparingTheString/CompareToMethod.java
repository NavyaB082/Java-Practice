package comparingTheString;

public class CompareToMethod {

	public static void main(String[] args) {
		
		//Compare To method is used to compare the strings character by character 
		//it returns the integer value as negative,zero or positive
		
		String s1="NAVYA";
		String s2="MUKUNDA";
		int res=s1.compareTo(s2);
		
		System.out.println(res);
		
		if(res>0) {
			System.out.println("String s1 is greater.");
		}
		else if(res<0) {
			System.out.println("String s2 is greater.");
		}
		else {
			System.out.println("Both Strings are equal.");
		}

	}

}
