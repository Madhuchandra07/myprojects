package advancedjava.demosql;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.*;  

public class DatabaseMetaDataDemo{  
	
public static void main(String args[]){  
	
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");  
  DatabaseMetaData dbmd = con.getMetaData();
  System.out.println("The name of the driver:"+dbmd.getDriverName());
  System.out.println("The username of the Database:"+dbmd.getUserName());
 System.out.println("The version of the Driver:"+dbmd.getDriverVersion()); 
  System.out.println("The product name of database:"+dbmd.getDatabaseProductName());
 System.out.println("The product version of database:"+dbmd.getDatabaseProductVersion()); 
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  