import java.util.Scanner;

public class MultipleTable {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of which u require the table: ");
		int table=scan.nextInt();
		int n=1;
		table(n,table);
	}
	public static void table(int n,int table) {
		
		if(n==11) {
			return;
		}
		else {
			System.out.println(table+" * "+n+" ="+(table*n));
			table(n+1,table);
		}
	}
}
