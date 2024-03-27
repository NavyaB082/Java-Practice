import java.sql.*;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice){
			case 1:insert(con);
			break;
			case 2:update(con);
			break;
			case 3:delete(con);
			break;
			case 4:fetchData(con);
			break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	static void insert(Connection con)throws Exception{
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?)";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the employee id");
		int id=scan.nextInt();
		
		System.out.println("enter the employee name");
		String name=scan.next();
		
		System.out.println("enter the employee salary.");
		float salary=scan.nextFloat();
		
		PreparedStatement pstmt=con.prepareStatement(query);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, salary);
		
		pstmt.execute();
		System.out.println("rows are inserted");
		fetchData(con);
		
	}
	
	static void update(Connection con) throws Exception{
		
		String query="UPDATE EMPLOYEE SET NAME=? WHERE ID=?";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name of the employee to be updated");
		String name=scan.next();
		
		System.out.println("Enter the id of which u have to change");
		int id=scan.nextInt();
		
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setInt(2, id);
		
		pstmt.executeUpdate();
		
		System.out.println("rows are updated");
		fetchData(con);
		
	}
	
	static void delete(Connection con)throws Exception{
		
		String query="DELETE FROM EMPLOYEE WHERE ID=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scan.nextInt();
		
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		System.out.println("Rows are deleted");
		fetchData(con);
		
	}
	static void fetchData(Connection con)throws Exception{
		String query="SELECT * FROM EMPLOYEE WHERE ID=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee id to show the data.");
		int id=scan.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
		
		
	}
	
	

}
