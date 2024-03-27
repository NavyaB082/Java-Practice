import java.util.Scanner;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of the array: ");
		int []arr=new int[scan.nextInt()];
		
		
		System.out.println("enter the elements to be entered: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Before Sorting :");
		for(int x:arr) {
			System.out.println(x+" ");
		}

		for(int i=0;i<=arr.length-2;i++) {
			int pos=i;
			int min=arr[pos];
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println("After Sorting: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}

}
