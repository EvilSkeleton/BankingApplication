package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerManager {
	
	public static Connection getConnection() throws SQLException,Exception
	{
		Connection conn = null;
		try
		{
			String dbDriver = "com.mysql.jdbc.Driver";
	        String dbURL = "jdbc:mysql://localhost:3306/";
	        // Database name to access
	        String dbName = "Bank";
	        String dbUsername = "root";
	        String dbPassword = "Daniel25#";
	  
	        Class.forName(dbDriver);
	        conn = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}

	public static double getBal(String user) {
		Connection conn = null;
		PreparedStatement st = null;
		double bal;
		try
		{
			conn = getConnection();
			st = conn.prepareStatement("select balance from Customer where accountNo=?");
            st.setString(1,user);
            ResultSet rs = st.executeQuery();
            bal = rs.getDouble(1);
            return bal;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
