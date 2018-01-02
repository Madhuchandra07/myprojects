package batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecords  {
public static void main(String[] args){
	try{
		
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
	con.setAutoCommit(false);
	Statement st=con.createStatement();
	st.addBatch("insert into assistix1 values(10,2015,'Madhuchandra')");
	st.addBatch("insert into assistix1 values(11,,'anirudha')");
	st.executeBatch();
	con.commit();
	con.close();
}
	catch(Exception e){
		System.out.println(e);
	}
}
}
