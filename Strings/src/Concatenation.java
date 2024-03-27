
public class Concatenation {

	public static void main(String[] args) {


		String s1="java";
		System.out.println(s1);
		s1.concat("Sql");
		System.out.println(s1);
		
//		whenever immutable String object is tried to be modified a new string object 
//		will be created and existing original string object will not be changed.

		//if new string object has to be accessed than the references variables must be 
		// pointing towards it.
		
		
		s1=s1.concat("sql");
		System.out.println(s1);
		
		
	}

}
