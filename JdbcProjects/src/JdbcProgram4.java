import java.sql.*;


public class JdbcProgram4 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="DELETE FROM STUDENT WHERE ROLLNO=1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("The driver is loaded.");
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			
			Statement stmt=con.createStatement();
			System.out.println("Statement is created.");
			
			stmt.execute(query);
			System.out.println("Statement is executed.");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
