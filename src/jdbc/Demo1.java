package jdbc;

import java.sql.*;

public class Demo1 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			// register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "pet");

			// creating statement
			Statement stmt = conn.createStatement();

			// Executing the statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM pet LIMIT 2;");

			// Iterating the result set
			while (rs.next()) {
				System.out.println(rs.getString(1));

			}

			// Closing the connection
			// conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			conn.close();
		}
	}
}
