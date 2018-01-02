package palindromeprogram;

import java.util.Scanner;

public class ReverseNumber {
	private static Scanner in;

	public static void main(String args[])
	   {
	      int n, reverse = 0;
	     
	 
	      System.out.println("Enter the number to reverse");
	      in = new Scanner(System.in);
	      n = in.nextInt();
	 
	      while( n != 0 )
	      {
	          reverse = reverse * 10;//0,30
	          reverse = reverse + n%10;//32
	          n = n/10;//2
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
	      
	      }
	   }

