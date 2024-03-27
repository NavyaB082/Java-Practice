import java.sql.*;


public class JdbcProgram2 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="INSERT INTO STUDENT VALUES(1,'NAVYA B')";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection is established.");
			
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("Statement executed successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		
	}

}
