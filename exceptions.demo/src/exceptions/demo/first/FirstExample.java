 package exceptions.demo.first;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FirstExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		PrintWriter pw= new PrintWriter("abc.text");
		pw.println("Hello");
		System.out.println(10/0);

	}

}
