import java.sql.*;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="INSERT INTO STUDENT VALUES(?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			//statement for placeholder is prepared statement
			PreparedStatement pstmt=con.prepareStatement(query);
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("enter the student roll no: ");
			int rollno=scan.nextInt();
			
			System.out.println("enter the student name: ");
			String name=scan.next();
			
			System.out.println("Enter the marks of the student");
			int marks=scan.nextInt();
			
			pstmt.setInt(1, rollno);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks);
			
			pstmt.execute();
			
			System.out.println("rows are inserted");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
//similarly for all other CRUD operations.