package advancedjava.demosql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreImages {

	public static void main(String[] args) {
		FileInputStream inputStream=null;
		File image = new File("D:/madhu.jpg");
        try {
			inputStream = new FileInputStream(image);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root"); 
		PreparedStatement pst = connection.prepareStatement("insert into trn_imgs(img_title, img_data) " + "values(?,?)");
		pst.setString(1, "packag");
		pst.setBinaryStream(2, (InputStream) inputStream, (int)(image.length()));
		pst.executeUpdate();
		connection.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
