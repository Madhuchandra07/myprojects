package palindromeprogram;

public class PalindromeLogic {

	public static void main(String[] args) {
		
		int num, reverse=0, original;
		int n = 12121;
		original=n;
		while(n>0)
		{
			
			num=n%10;
			reverse = (reverse*10)+num;
			n=n/10;

		}
		if (original==reverse){
			System.out.println("The given number is palindrome");
			
		}
		else
			{
			
			System.out.println("The given number is not a palindrome");
			}
			}

		
	}


