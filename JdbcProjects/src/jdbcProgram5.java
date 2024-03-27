import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcProgram5 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="DROP TABLE STUDENT";
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
