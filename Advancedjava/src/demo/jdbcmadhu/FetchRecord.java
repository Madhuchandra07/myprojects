package demo.jdbcmadhu;
import java.sql.*;  
class FetchRecord{  
public static void main(String args[])throws Exception{  
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("");  
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
ResultSet rs=stmt.executeQuery("select * from assistix1");  
  
//getting the record of 3rd row  
rs.absolute(3);  
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
  
con.close();  
}}  