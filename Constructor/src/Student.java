
public class Student {
	String name;
	int age,rollno;
	
//	public Student(String name,int age,int rollno) {
//		name=name;
//		age=age;
//		rollno=rollno;
//	}
	
	
	//the above commented is the shadowing problem
	//it is the scenario where local and instance variable names are same name
	//assignment of the values will not happen from local to instance rather it will happen from 
	// local to local
	
	//this can be resolved by using "this" keyword as shown below
	
	public Student(String name,int age,int rollno) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	

	public static void main(String[] args) {
		Student st1=new Student("Navya_B",23,78);
		System.out.println(st1.name+" "+st1.age+" "+st1.rollno);
		Student st2=new Student("Mukunda_M",23,82);
		System.out.println(st2.name+" "+st2.age+" "+st2.rollno);
		
		//the process of creating the multiple constructors in the same class.
		//Student st3=new Student();
		//this will give you the error if we dont give values to it.

	}

}
