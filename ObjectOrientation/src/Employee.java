
public class Employee {
//Data members
	String name;
	int age;
	String gender;
	float salary;
	String email;
	
//Member functions
	void eat() {
		System.out.println("Employee is eating");
	}
	void work() {
		System.out.println("Employee is working");
	}
	void attending() {
		System.out.println("Employee is attending meeting.");
	}
	
	//main method
	public static void main(String[] args) {
		// creating the object
		Employee e1=new Employee();
		System.out.println(e1.name="Navya B");
		System.out.println(e1.age=23);
		System.out.println(e1.gender="Female");
		System.out.println(e1.salary=60000F);
		System.out.println(e1.email="navyab082@gmail.com");
		e1.eat();
		e1.work();
		e1.attending();
		
		//anonymous object
		new Employee().work();
		
		//the object created without any reference variable is called as anonymous object.

	}

}
