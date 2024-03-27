import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		
		int[]arr=new int[scan.nextInt()];
		
		
		System.out.println("enter the elements to be stored: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("enter the key element to be searched: ");
		int key=scan.nextInt();
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(key==arr[i]) {
				System.out.println("key found is "+arr[i]);
			}
			else if(key>=arr[i]) {
				low=mid+1;
			}
			else {
				low=mid-1;
			}
		}
	}

}
