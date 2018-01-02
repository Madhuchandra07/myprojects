package advancedjava.demosql;
import java.sql.*;  
class Dbmd3{  
public static void main(String args[]){  
	File image = new File("D:/madhu.jpg");
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","root");  
  
DatabaseMetaData dbmd=con.getMetaData();  
String table[]={"TABLE"};  
ResultSet rs=dbmd.getTables(null,null,null,table);  
  
while(rs.next()){  
System.out.println(rs.getString(3));  
}  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}