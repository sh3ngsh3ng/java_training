import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import oracle.jdbc.OracleDriver;

public class MyFirstJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet res;
		PreparedStatement pstmt;
		
		try {
			Scanner sc = new Scanner(System.in);
			// Registering driver
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			
			// Getting Connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "SYSTEM");
			System.out.println("Connection Established");
			
			// Giving statement in the form of string (converted to query)
//			stmt = con.createStatement();  // when no need for placeholder
//			res = stmt.executeQuery("select * from STUDENT");
			
			
			// Prepared Statements (from user's input)
//			pstmt = con.prepareStatement("select * from STUDENT where id=?"); // if u need placeholder
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the id of the student");
//			int temp = sc.nextInt();
//			pstmt.setInt(1, temp);
//			res = pstmt.executeQuery();
			
			
			// Get Table Details
//			ResultSetMetaData rsmd = res.getMetaData(); // for table details
//			
//			for(int i = 1; i <= rsmd.getColumnCount(); i++) {
//				System.out.println(rsmd.getColumnName(i));
//				System.out.println(rsmd.getColumnTypeName(i));
//			}
			
			
			// Updating Table
//			pstmt = con.prepareStatement("update STUDENT set marks1=? where id=?");
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the marks1 to be updated");
//			int temp1 = sc.nextInt();
//			
//			System.out.println("Enter the ID of the student whose marks has to be updated");
//			int temp2 = sc.nextInt();
//			
//			pstmt.setInt(1, temp1);
//			pstmt.setInt(2, temp2);
//			int updatedRow = pstmt.executeUpdate();
//			System.out.println("Table updated");
//			System.out.println(updatedRow);
			
			
			// DELETING
//			pstmt = con.prepareStatement("delete from STUDENT where id=?");
//			System.out.println("Enter the student id to be removed from the table");
//			int remove = sc.nextInt();
//			pstmt.setInt(1, remove);
//			int updatedRow = pstmt.executeUpdate();
//			System.out.println("Table updated");
//			System.out.println(updatedRow);
			
			
			
			// INSERTING
//			Scanner sc = new Scanner(System.in);
//			pstmt = con.prepareStatement("insert into STUDENT values(?,?,?,?,?)");
//			System.out.println("Enter student id, name, marks1, marks2, marks3");
//			int tempId = sc.nextInt();
//			String tempName = sc.next();
//			int tempM1 = sc.nextInt();
//			int tempM2 = sc.nextInt();
//			int tempM3 = sc.nextInt();
//			pstmt.setInt(1, tempId);
//			pstmt.setString(2, tempName);
//			pstmt.setInt(3, tempM1);
//			pstmt.setInt(4, tempM2);
//			pstmt.setInt(5, tempM3);
//			int updatedRow = pstmt.executeUpdate();
//			System.out.println("Table updated");
//			System.out.println(updatedRow);
			
			
			
			
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement("update STUDENT set marks1=? where id=?");
			System.out.println("Enter marks to be updated");
			int temp = sc.nextInt();
			System.out.println("Enter student id");
			int temp1 = sc.nextInt();
			pstmt.setInt(1, temp);
			pstmt.setInt(2, temp1);
			int rows1 = pstmt.executeUpdate();
			

			pstmt = con.prepareStatement("update STUDENT set marks1=? where id=?");
			System.out.println("Enter marks to be updated");
			int temp2 = sc.nextInt();
			System.out.println("Enter student id");
			int temp3 = sc.nextInt();
			pstmt.setInt(1, temp2);
			pstmt.setInt(2, temp3);
			int rows2 = pstmt.executeUpdate();
			
			if (rows1>0 && rows2>0) {
				con.commit();
			}
			


			
			
			
			
			// UPDATE by BATCH
//			con.setAutoCommit(false);
//
//			stmt = con.createStatement();
//			
//			stmt.addBatch("update STUDENT set marks1=100 where id=1");
//			
//			stmt.addBatch("update STUDENT set marks1=200 where id=2");
//			
//			stmt.addBatch("update STUDENT set marks1=300 where id=3");
//			
//			
//			stmt.executeBatch();
//			con.commit();

			
			// UPDATE EXECUTION
//			int updatedRow = pstmt.executeUpdate();
//			System.out.println("Table updated");
//			System.out.println(updatedRow);
			
			// PRINT ROW VALUES
//			while (res.next()) {
//				int id = res.getInt(1);
//				String name = res.getString(2);
//				int marks1 = res.getInt(3);
//				int marks2 = res.getInt(4);
//				int marks3 = res.getInt(5);
//				System.out.println(id +"    "+ name +"    "+ marks1+"     "+marks2+"    "+marks3);
//			}
			
		} catch (SQLException e) {
//			con.rollback();
			e.printStackTrace();
		}
		
	}

}
