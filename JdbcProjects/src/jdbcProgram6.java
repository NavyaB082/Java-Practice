import java.sql.*;

public class jdbcProgram6 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="SELECT * FROM STUDENT";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			
			System.out.println("Every thing is fine u can see the result which have been fetched.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
