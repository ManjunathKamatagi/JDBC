package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM name where sl_no = ? ");
			ps.setInt(1, 2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

}
