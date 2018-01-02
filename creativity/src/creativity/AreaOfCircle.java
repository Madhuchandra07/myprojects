package creativity;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		radius=sc.nextInt();
		
		/*double pi=3.14;*/
		System.out.println("Area of the circle=   "+Math.PI*radius*radius);
		

	}

}
