package mutableStrings;

public class Capacity {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		
		sb.append("I am learning java");
		System.out.println(sb.capacity());//34
		
		sb.append("I am learning java");
		System.out.println(sb.capacity());//70

		
		//new location=16*2+2=34
		//34*2+2=70
	}

}
