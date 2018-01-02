package transactionmgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TransacMgmt {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		
		con.setAutoCommit(false);
		Statement st= con.createStatement();
		st.executeUpdate("insert into assistix1 values(10,2015,'Madhuchandra')");
		st.executeUpdate("insert into assistix1 values(11,2016,'anirudha')");	
		
	
		
		con.rollback();
		con.close();
	}

}
