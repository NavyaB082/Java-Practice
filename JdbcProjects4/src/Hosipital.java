import java.sql.*;
import java.util.*;

public class Hosipital {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="INSERT INTO HOSIPITAL VALUES(?,?,?)";
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number of rows to be inserted");
			int rows=scan.nextInt();
			
			for(int i=0;i<=rows;i++) {
				System.out.println("Enter the id of the patients "+(i+1));
				int id =scan.nextInt();
				
				System.out.println("enter the name of the patients "+(i+1));
				String name=scan.next();
				
				System.out.println("enter the age of the patient "+(i+1));
				int age=scan.nextInt();
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				
				pstmt.addBatch();
			}
			
			pstmt.executeBatch();
			System.out.println("rows are inserted.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
