import java.util.Scanner;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of the array: ");
		int []arr=new int[scan.nextInt()];
		
		System.out.println("enter the elements of an array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("The elements before sorting: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-i-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("after sorting :");
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
