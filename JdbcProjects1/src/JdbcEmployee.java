import java.sql.*;
import java.util.Scanner;
public class JdbcEmployee {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		Connection con=null;
		Statement stmt=null;
		
		try {
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			stmt=con.createStatement();
			System.out.println("Statement is ready.");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the choice.");
			int choice=scan.nextInt();
			
			switch(choice){
			case 1:create(stmt);
			break;
			case 2:insert(stmt);
			break;
			case 3:update(stmt);
			break;
			case 4:delete(stmt);
			break;
			case 5:fetchData(stmt);
			break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void create(Statement stmt)throws Exception{
		String query="CREATE TABLE EMPLOYEE(ROLLNO INT,NAME VARCHAR(10),SALARY FLOAT)";
		stmt.execute(query);
		System.out.println("table is created.");
		fetchData(stmt);
	}
	
	static void insert(Statement stmt)throws Exception{
		String query="INSERT INTO EMPLOYEE VALUES(1,'NAVYA',35.98F)";
		stmt.execute(query);
		System.out.println("one row is inserted");
		fetchData(stmt);
	}
	
	static void update(Statement stmt)throws Exception{
		String query="UPDATE EMPLOYEE SET NAME='MUKUNDA' WHERE ROLLNO=1";
		stmt.execute(query);
		System.out.println("row has been updated");
		fetchData(stmt);
	}
	
	static void delete(Statement stmt)throws Exception{
		String query="DELETE FROM EMPLOYEE WHERE ROLLNO=1";
		stmt.execute(query);
		System.out.println("The row is deleted");
		fetchData(stmt);
	}
	
	static void fetchData(Statement stmt)throws Exception{
		String query="SELECT * FROM EMPLOYEE";
		ResultSet rs=stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
		System.out.println("data is fetched");
		
	}

}
