package immutableStrings;

public class ThreeTypesOfCreatingImmutableStrings {

	public static void main(String[] args) {


		//type1
		String s1="Navya B";
		
		String s2="Mukuda M";
		
		//type2
		String a=new String("1JS19EC082");
		
		String b=new String("1JS19EC078");
		
		//TYPE 3
		char[]ch= {'j','s','s'};
		String c=new String(ch);
		
		System.out.println(s1+" "+s2);
		System.out.println(a+" "+b);
		System.out.println(c+" college");

	}
}
	
