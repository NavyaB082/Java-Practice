
public class MethodOverloading {

	public static void main(String[] args) {
		// Parameters are the mechanism to store the input given to a method.It is also 
		//called as formal parameters.
		
		//Arguments are the set of values or variables which are passed while calling a method
		//these are also called as actual parameters.
		
		maggi();
		maggi(2);
		maggi("veg");
		maggi("Chesse ",4);
		

	}
	public static void maggi() {
		System.out.println("Bill for normal maggi is 30rs");
	}
	
	public static void maggi(int quantity) {
		System.out.println("Bill for "+quantity+" normal maggi is "+(quantity*30)+"Rs");
	}
	
	public static void maggi(String type) {
		System.out.println("Bill for "+type+" maggi is 50Rs");
	}
	
	public static void maggi(String type,int quantity) {
		System.out.println("Bill for "+quantity+" "+type+"maggi is "+(quantity*50)+"Rs");
	}
	
	

}
