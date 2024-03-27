
public class Student {
	
	String name;
	int age;
	String gender;
	
	void study() {
		System.out.println("Student is studying.");
	}
	
	void introduce() {
		System.out.println("Student is introducing.");
	}

	public static void main(String[] args) {
		// The style or approach of writing the programs to solve the real-world problems.
		//the project will consists of classes and objects.
		
		//class is called as blueprint of an object or it is also considered as template 
		// for JVM to create an object.
		
		//Object is the programming representation of the real world entities.
		
		
		
		//creating a new object
		Student s1=new Student(); //Object
		s1.name="Navya B";        //giving some inputs to behave it as object from class blueprint.
		s1.age=23;                
		s1.gender="Female";
		s1.study();
		s1.introduce();
		
		Student s2=new Student();
		s2.name="Mukunda M";
		s2.age=23;
		s2.gender="Male";
		s2.study();
		s2.introduce();

		
		//every object consists of data types,behaviour and actions.
	}

}
