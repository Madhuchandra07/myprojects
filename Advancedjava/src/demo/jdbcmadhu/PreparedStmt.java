package demo.jdbcmadhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int row =sc.nextInt();
		
		int rowupdate;
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root"); 
			PreparedStatement pst = con.prepareStatement("insert into assistix1 values(?,?,?)");
			while(row!=0)
			{
				System.out.println("Enter student id/ passedout/ studentname");
			
			pst.setInt(1, sc.nextInt());
			pst.setInt(2, sc.nextInt());
			pst.setString(3, sc.next());
	rowupdate =pst.executeUpdate();
	System.out.println(rowupdate+"row updated");
	row--;
			}
		
			
			
			con.close();

	}

			catch(Exception e){ System.out.println(e);}  
		}
	

	}


