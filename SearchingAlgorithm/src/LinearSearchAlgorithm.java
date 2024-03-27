import java.util.Scanner;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of the array.");
		int[]arr=new int[scan.nextInt()];
		
		System.out.println("enter the elements to be stored:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("enter the key element should be printed: ");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				System.out.println("key is found at "+(i+1)+"th index is:"+arr[i]);
			}
		}

		
		
		
	}

}
