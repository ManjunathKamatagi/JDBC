package jdbc;

import java.sql.*;


public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training, root, testDb");
			 Statement stmt = conn.createStatement();
			 stmt.executeUpdate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
	}
}
