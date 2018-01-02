package advancedjava.demosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDemo {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement st = con1.createStatement();
			
			String sql=
			
			
			
			ResultSet rst = st.executeQuery("select*from assistix1");
			System.out.println("Id"+"||"+"year of passed out"+"||"+"name");
			
			while(rst.next()){

				System.out.println(rst.getInt(1)+"||"+rst.getInt(2)+"||"+rst.getString(3));
			
			}
			con1.close();
		} 
		
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}

}
