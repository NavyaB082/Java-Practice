import java.sql.*;
public class StudentApp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		String query="INSERT INTO STUDENT VALUES(?,?,?)";
		
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			
			System.out.println("COnnection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			
			Student st1=new Student(11,"Navya",88);
			pstmt.setInt(1, st1.rollno);
			pstmt.setString(2, st1.name);
			pstmt.setInt(3, st1.marks);
			pstmt.execute();
			
			Student st2=new Student(12,"Mukunda",78);
			pstmt.setInt(1, st2.rollno);
			pstmt.setString(2, st2.name);
			pstmt.setInt(3, st2.marks);
			pstmt.execute();
			
			Student st3=new Student(13,"Sharu",99);
			pstmt.setInt(1, st3.rollno);
			pstmt.setString(2, st3.name);
			pstmt.setInt(3, st3.marks);
			pstmt.execute();
			
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

}
