package advancedjava.demosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class CreateMysqlTable {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement st = co.createStatement();
			/*st.executeUpdate("create table india(state varchar(100) NOT NULL,"
					+ " language varchar(50) NOT NULL, "
					+ "populationincrore Int Not null, PRIMARY KEY(state))");
			System.out.println("Table is created");*/
			/*st.executeUpdate("insert into india values('karnataka','kannada',7) ");
			st.executeUpdate("insert into india values('telangana','telugu',3) ");
			st.executeUpdate("insert into india values('andra','telugu',3) ");
			st.executeUpdate("insert into india values('tamilnadu','tamil',2) ");
			st.executeUpdate("insert into india values('kerala','malayalam',5) ");
			st.executeUpdate("insert into india values('maharashtra','marati',6) ");*/
			ResultSet rs= st.executeQuery("select*from india");
			while(rs.next()){
				System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
			}
			System.out.println("========================================");
			ResultSetMetaData rsmd =rs.getMetaData();
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
			System.out.println("Name of the table: "+rsmd.getTableName(1));
			
			co.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
