import java.util.Scanner;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("enter trhe size of the array: ");
		int []arr=new int[scan.nextInt()];
		
		System.out.println("enter the elements to be entered: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Before Sorting: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		
		System.out.println("After Sorting: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
