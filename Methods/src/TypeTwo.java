import java.util.Scanner;

public class TypeTwo {

	public static void main(String[] args) {
		// The methods which accept input and does not return any output. 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		learnJava(name);
	}
	public static void learnJava(String name) {
		System.out.println(name+" is learning java");
	}

}
