package creativity;

public class ReverseStringDemo {
	static int i;

	public static void main(String[] args) {
		System.out.println("Enter the string");
		ReverseStringDemo.reverseString("Madhuchadra A N");
		

	}

	public static void reverseString(String s){
		char[] ch= new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
			System.out.print(ch[i]); 
		}
		System.out.println("==========");
		System.out.println("The reverse of the given string is");
			for( i=s.length()-1;i>=0;i--){
				System.out.print(ch[i]);
		}
		
	}
}
