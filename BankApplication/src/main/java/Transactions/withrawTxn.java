package Transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Java.CustomerManager;

public class withrawTxn {
public static void main(int accountNo,double amount) {
		
		PreparedStatement st=null;
		Connection conn=null;
		
		java.util.Date date=new java.util.Date();
		java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());

		try
		{
			conn=CustomerManager.getConnection();
			st = conn.prepareStatement("insert into Transactions values=(?,?,?,?)");
			st.setInt(1,accountNo);
			st.setTimestamp(2,sqlTime);
			st.setDouble(3,amount);
			st.setString(4,"CREDIT");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
