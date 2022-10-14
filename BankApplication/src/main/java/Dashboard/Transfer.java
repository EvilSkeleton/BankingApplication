package Dashboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Java.CustomerManager;

public class Transfer {

	public static boolean transfer(String userName, double amt, String pass) {
		PreparedStatement st=null;
		
		Connection conn=null;
		
		try 
		{
			conn=CustomerManager.getConnection();
			st = conn.prepareStatement("select pass,balance from Customer where accountNo=?");
			st.setString(1,userName);
            ResultSet rs = st.executeQuery();
            rs.next();
            if(rs.getString(1).equals(pass) || rs.getString(1) == pass)
            {
            	double bal = rs.getDouble(2);
            	bal = bal - amt;
            	PreparedStatement st1 = conn.prepareStatement("update Customer set balance=? where accountNo=?");
            	st1.setDouble(1,bal);
            	st1.setString(2,userName);
            	st1.executeUpdate();
                st.close();
                conn.close();
                
            	return true;
//            	out.println("<font color=red>Transaction Succesful.</font>");
            }
//        		out.println("<font color=red>Password is wrong.</font>");
            st.close();
            conn.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
    
        return false;
	}
	
}
