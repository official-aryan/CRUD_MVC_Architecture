package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class model implements modelContract {

	Connection con;
	java.sql.Statement smt;
	
	@Override
	public void connectDB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/aryan","root","Aryan1163@");
			smt= con.createStatement();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verify(String Username, String Password) {
		
		
		try
		{
			ResultSet result =smt.executeQuery("select * from login where username='"+Username+"' and Password='"+Password+"'");
			return result.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
		
		
	}

	@Override
	public void StoreData(String Username, String Password) {

		try
		{
			smt.execute("insert into login values('"+Username+"','"+Password+"')");
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet display() {
		
		try
		{
			ResultSet result =smt.executeQuery("select * from login");
			return result;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void delete(String Username) {
		
		try
		{
			smt.execute("delete from login where Username='"+Username+"'");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void Update(String Username, String Password) {
		
		try
		{
			smt.execute("update login set Password='"+Password+"' where Username='"+Username+"'");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
