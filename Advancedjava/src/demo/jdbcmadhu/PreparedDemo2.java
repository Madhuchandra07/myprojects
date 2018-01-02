package demo.jdbcmadhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedDemo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		
		int row =sc.nextInt();
		
		int rowupdate;
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root"); 
			PreparedStatement pst = con.prepareStatement("delete from assistix1 where student_id=(?)");
			while(row!=0){
				System.out.println("Enter the student_id row you want to delete");
			pst.setInt(1, sc.nextInt());
	           rowupdate =pst.executeUpdate();
	           System.out.println(rowupdate+"row deleted");
	           row--;
			}
	ResultSet rs= pst.executeQuery("select* from assistix1");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"     "+rs.getInt(2)+"     "+rs.getString(3));
	}
			
			
			con.close();

	}

			catch(Exception e){ System.out.println(e);}  
		}
	

	}
