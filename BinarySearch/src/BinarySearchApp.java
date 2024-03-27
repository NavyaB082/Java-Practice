import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of the array: ");
		int[]arr=new int[scan.nextInt()];
		
		System.out.println("enter the elements of the array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("the elements of the array are: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("enter the key :");
		int key=scan.nextInt();

		
		int low=0,high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("key found at index: "+mid);
				return;
			}
			else if(key>arr[mid]) {
				low=mid+1;
		
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("key not found ");
		
		

	}

}
