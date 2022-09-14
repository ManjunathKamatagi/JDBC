package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo3 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training, root, testDb");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO name VALUES(?,?)");
			ps. setInt(1, 2);
			ps.setString(1, "Raj");
			ps.executeUpdate();
			System.out.println("Recored Added using preparedStatement");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			conn.close();
		}

	}

}
