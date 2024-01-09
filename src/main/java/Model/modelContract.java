package Model;

import java.sql.ResultSet;

public interface modelContract 

{
	public void connectDB();
	public boolean verify(String Username, String Password);
	public void StoreData(String Username, String Password);
	public ResultSet display();
	public void delete(String Username);
	public void Update(String Username, String Password);
	
	
}
