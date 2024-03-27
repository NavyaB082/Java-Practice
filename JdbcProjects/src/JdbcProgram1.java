//load the driver ,establish the connection,create the statement,execute the query.

//CURD OPERATIONS

import java.sql.*;

public class JdbcProgram1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="CREATE TABLE STUDENT(ROLLNO INT,NAME VARCHAR(10))";
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			//Establish the connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			
			//create the statement
			Statement stmt=con.createStatement();
			
			//Execute the query
			stmt.execute(query);
			System.out.println("Query is executed.");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
