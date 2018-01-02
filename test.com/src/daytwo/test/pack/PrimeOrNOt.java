package daytwo.test.pack;

import java.sql.Date;
import java.util.Scanner;

public class PrimeOrNOt {

	public static void main(String[] args) {
		int n,m;
		int flag=0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=n/2;
		if(n==0||n==1){
		System.out.println("The given number is not prime number");
		}
		/*if(n%2==0){
			System.out.println("The given number is not a prime number");
		}
*/		for(int i=2;i<m;i++){
			if(n%i==0)
			{
				
				System.out.println("The entered number is not a prime number");
				flag=1;
				break;
				
			}
}
			
			if(flag==0){
				System.out.println("The entered number is a prime number");
			}
			
			



}
		
		
	}

			
			
		

	


