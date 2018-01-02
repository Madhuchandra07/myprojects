package dayOne;

public class Interfaces {
	public static void main(String[] args){
		Q a = new Q();
        a.interestRate();
        a.load();
		
		
	}

}
interface Bank
{
	void interestRate();
	void load();
}
 class Axis
{
	 public void any()
	 {
	System.out.println("fsaf");
	 }
	 public void interestRate(){
		 System.out.println("Interest is 10 percent");
	 }
}
class Q extends Axis implements Bank
{
	
		
	public void load()
	{
		System.out.println("Something");
	}
}



	
