package NumberPattern;

public class SimpleNumberPrinting {

	public static void main(String[] args) {
		
	/* 1111
	 * 2222
	 * 3333
	 * 4444	
	 */
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

		
	/*12345
	 *12345
	 *12345
	 *12345
	 *12345
	 */
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
	/* 1
	 * 12
	 * 123
	 * 1234
	 * 12345	
	 */
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
	/* 1
	 * 23
	 * 456
	 * 78910	
	 */
//		int num=1;
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(num);
//				num++;
//			}
//			System.out.println();
//		}
		
	/*	01 02 03 04 
		05 06 07 08 
		09 10 11 12 
		13 14 15 16  */
		
//		int num=1;
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(num<10) {
//					System.out.print("0"+num+" ");
//					num++;
//				}
//				else {
//					System.out.print(num+" ");
//					num++;
//				}
//			}
//			System.out.println();
//		}
		
		
		
	/*	16 15 14 13 
		12 11 10 09 
		08 07 06 05 
		04 03 02 01  */
		
//		int num=16;
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(num>=10) {
//					System.out.print(num+" ");
//					num--;
//				}
//				else {
//					System.out.print("0"+num+" ");
//					num--;
//				}
//			}
//			System.out.println();
//		}
		
		
	/*	02 
		04 06 
		08 10 12 
		14 16 18 20 */
		
  
//		int num=2;
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				if(num<10) {
//					System.out.print("0"+num+" ");
//					num=num+2;
//				}
//				else {
//					System.out.print(num+" ");
//					num=num+2;
//				}
//				
//			}
//			System.out.println();
//		}
		
	/*	1 2 3 4 
		8 7 6 5 
		9 10 11 12 
		16 15 14 13 */

		
		
//		int k=0;
//		int t=1;
//		int n=4;
//
//		for(int i=0;i<n;i++){
//
//		    for(int j=0;j<n;j++){
//		        k+=t;
//		        System.out.print(k+" ");
//		    }
//		    k=k+n+t;
//		    t=-t;
//		    System.out.println();
//		}
		
	/*	02 04 06 08 
		01 03 05 07 
		10 12 14 16 
		09 11 13 15  */
		
//		int a=2;
//		int b=1;
//		for(int i=1;i<=4;i++) {
//			if(i==1||i==3) {
//				for(int j=1;j<=4;j++) {
//					if(a<10) {
//						System.out.print("0"+a+" ");
//					}
//					else {
//						System.out.print(a+" ");
//					}
//					a+=2;
//				}
//				System.out.println();
//			}
//			else if(i==2||i==4) {
//				for(int j=1;j<=4;j++) {
//					if(b<10) {
//						System.out.print("0"+b+" ");
//					}
//					else {
//						System.out.print(b+" ");
//					}
//					b+=2;
//				}
//				System.out.println();
//			}
//		}
		
		
	}

}
