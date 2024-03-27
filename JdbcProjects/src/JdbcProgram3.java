import java.sql.*;
public class JdbcProgram3 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="UPDATE STUDENT SET NAME='MUKUNDA'WHERE ROLLNO=1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded.");
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			
			Statement stmt=con.createStatement();
			System.out.println("Statement is established.");
			stmt.execute(query);
			System.out.println("query is executed.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	

}
