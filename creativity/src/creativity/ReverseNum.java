package creativity;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse");
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		String inputString = String.valueOf(n);
		 StringBuffer stringBuffer = new StringBuffer(inputString);
		   stringBuffer.reverse();
		   String reversedString = stringBuffer.toString();
		   int reversedInt = Integer.parseInt(reversedString);
		   System.out.println("The reversed number is");
		   System.out.println(reversedInt);
		 
	
	}
		
	}


