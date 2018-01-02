package mynewprogram.first;

import java.io.*;

public class SerializationDemo {

	public static void main(String[] args)throws IOException {
		Student s= new Student(211,"madhu");
		 FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s);  
		  out.flush();  
		  System.out.println("success"); 
	}

}
