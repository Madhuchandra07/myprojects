package advancedjava.demosql;
import java.sql.*;  

public class JdbcDemo1 {

	public static void main(String[] args) {
			 
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");  
		//here madhuchandra is database name, root is username and password  
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into madhutabledemo values(1,'ashok',25,'avd','ghd')");
		
		
		}
		
		catch(Exception e)
		{ System.out.println(e);
		} 


		}  
		

	}


