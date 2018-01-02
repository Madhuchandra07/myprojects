package creativity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AreaUsingBuffer {

	public static void main(String[] args) {
		int radius= 0;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the value of radius");
		 try {
			radius = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 double area= radius*radius*Math.PI;
		 System.out.println("The area of the given circle is" +area);

	}

}
