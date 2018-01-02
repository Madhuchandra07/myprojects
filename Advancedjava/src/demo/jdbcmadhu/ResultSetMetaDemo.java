package demo.jdbcmadhu;

import java.sql.*;  
class ResultSetMetaDemo{  
public static void main(String args[]){  
	
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");  
  
PreparedStatement ps=con.prepareStatement("select * from assistix1");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  