package models;
import java.sql.*;

public class AuthModel 
{
	
	public AuthModel()
	{
		
	}
	
	public boolean login(String user, String psw)
	{
		try (Connection cn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_testeoDB", "freedb_mel2891", "&e$2*JamK*VtMV8"))
		{
			try(PreparedStatement stm = cn.prepareStatement("select * from users where user = ? and password = ?"))
			{
				stm.setString(1, user);
				stm.setString(2, psw);
			
				try(ResultSet rs = stm.executeQuery()) 
				{
					return rs.next();
				}
			}
		} catch (Exception e2) 
		{
			e2.printStackTrace();
			return false;
		}
	}

}
