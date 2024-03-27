
public class Laptop {

	String processor,brand,os;
	int ram;
	float cost;
	
	void switchon() {
		System.out.println("laptop is switched on.");
	}
	
	void switchoff() {
		System.out.println("laptop is switched off");
	}
	
	void details() {
		System.out.println(processor);
		System.out.println(brand);
		System.out.println(os);
		System.out.println(ram);
		System.out.println(cost);
	}
	
	//constructor
	public Laptop(String a,String b,String c,int d,float e) {
		processor=a;
		brand =b;
		os=c;
		ram=d;
		cost=e;
		
	}
	//In case if constructor is not present , the default constructor is called
	//when object is created
	
	
	public static void main(String[] args) {
		//creating an object
		Laptop l1=new Laptop("i5","HP","windows",8,75000F);
		l1.switchon();
		l1.details();
		l1.switchoff();
		
	}

}
//the local variables and instance variables are not same in the above program but
//according to the convention of java local variables and instance variables should be same.

//as shown in student class