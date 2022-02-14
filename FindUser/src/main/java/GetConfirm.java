import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.MyConnection;

public class GetConfirm {
	public boolean getconfirm(String usersname , String password)
	{ 
		try {
		Connection con = MyConnection.Create();
		String queiry = "select *from usertable where username=? and password=?";
		PreparedStatement pstmt =con.prepareStatement(queiry);
		pstmt.setString(1, usersname);
	 	pstmt.setString(2, password);     
     	ResultSet rs = pstmt.executeQuery();
    	
    	while(rs.next())
    	{
    		if(usersname.equals(rs.getString(1)))
    		{
    			if(password.equals(rs.getString(2)))
    			return true;
    		}
    	}

		
		
		
			
		
    	
    	
    	}
	 catch (SQLException e) {
	
		e.printStackTrace();
	}
	
		return false;
	}

}
