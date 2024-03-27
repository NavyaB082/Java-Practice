package ContinueControlConstructs;

public class ReturnControlConstructs {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			if(i==5) {
				return;
			}
			System.out.print(i+" ");
		}

	}

}
