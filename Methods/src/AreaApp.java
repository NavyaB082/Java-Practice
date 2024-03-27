import java.util.Scanner;

public class AreaApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the side of the square");
		int side=scan.nextInt();
		System.out.println("the area of the sqaure of side "+side+" is "+calculatearea(side));
		
		System.out.println("enter the length and breadth of the rectangle");
		int length=scan.nextInt();
		int breadth=scan.nextInt();
		System.out.println("the area of the rectangle of is "+calculatearea(length,breadth));
		
		System.out.println("enter the radius of the circle");
		float radius=scan.nextFloat();
		System.out.println("the area of the circle is "+calculatearea(radius));
		

	}
	public static int calculatearea(int side) {
		int result=side*side;
		return result;
	}
	
	public static int calculatearea(int length,int breadth) {
		return length*breadth;
	}
	
	public static float calculatearea(float radius) {
		return 3.14F*radius*radius;
	}

}
