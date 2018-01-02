package demo.jdbcmadhu;

import java.sql.*;  
class InsertPrepared{  
public static void main(String args[]){  
	
try{  
	
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");  
  
PreparedStatement stmt=con.prepareStatement("insert into assistix1 values(?,?,?)");  
stmt.setInt(1,40);
stmt.setInt(2,2011);//1 specifies the first parameter in the query  
stmt.setString(3,"Ratan");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  