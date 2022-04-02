import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class MySecondJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet res;
		
		try {
			Scanner sc = new Scanner(System.in);
			// Registering driver
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			
			// Getting Connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "SYSTEM");
			System.out.println("Connection Established");
			
			
//			Update by batch
			stmt = con.createStatement();
			stmt.addBatch("update STUDENT set marks1=10 where id=1");
			stmt.addBatch("update STUDENT set marks1=20 where id=2");
			stmt.addBatch("update STUDENT set marks1=30 where id=3");
			stmt.executeBatch();
			
			
		} catch(SQLException e) {
			con.rollback();
			e.printStackTrace();
		} finally {
//			con.close();
			pstmt = null;
		}
		
		
	}

}
