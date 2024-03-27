import java.sql.*;
import java.util.*;

public class Transactions {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="NAVILU123";
		
		String query1="UPDATE BANK SET AMOUNT=AMOUNT-? WHERE ACCOUNT_NO=111";
		String query2="UPDATE BANK SET AMOUNT=AMOUNT+? WHERE ACCOUNT_NO=333";
		
		Connection con=null;
		
		
		try {
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established.");
			//setting autocommit status has false
			con.setAutoCommit(false);
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the amount to be transfered.");
			int amount=scan.nextInt();
			
			PreparedStatement pstmt1=con.prepareStatement(query1);
			PreparedStatement pstmt2=con.prepareStatement(query2);
			
			pstmt1.setInt(1, amount);
			pstmt2.setInt(1, amount);
			
			pstmt1.executeUpdate();
			System.out.println("Amount is debited from account 111");
			
			pstmt2.executeUpdate();
			System.out.println("Amount is credited from account 333");
			
			//commiting the chnages
			con.commit();
			
		}
		catch(Exception e) {
			try {
				con.rollback();
				System.out.println("Changes are rolled back");
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}

	}
}
