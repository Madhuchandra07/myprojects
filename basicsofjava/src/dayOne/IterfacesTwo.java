package dayOne;

public class IterfacesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T a1 = new T();
		a1.m1();
		a1.m2();

	}

}
interface Right
{
	void m1();
	}
interface Left
{
	void m2();
}
class T implements Right, Left
{
	public void m1()
 	{
		System.out.println("Welcome");
	}
	public void m2()
	{
		System.out.println("Madhuchandra");
	
	}
	
}
