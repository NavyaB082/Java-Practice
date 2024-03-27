import java.util.Arrays;
import java.util.Scanner;

public class ArraySortMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of the array: ");
		int []arr=new int[scan.nextInt()];
		
		System.out.println("enter the elements of an array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array before sorting: ");
		for(int x:arr) {
			System.out.print (x+" ");
		}

		System.out.println();
		
		
		Arrays.sort(arr);
		System.out.println("Array after sorting: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
