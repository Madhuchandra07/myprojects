package demo.jdbcmadhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoPrepared {
	public static void main(String args[]){  
		
		try{  
			
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root"); 
		Statement stmt=con.createStatement();
		
		ResultSet res= stmt.executeQuery("select student_name from assistix1");

		
		while(res.next()){
			System.out.println(res.getString(1));
			
		}
		System.out.println("selected");
		con.close();

}

		catch(Exception e){ System.out.println(e);}  
	}
}