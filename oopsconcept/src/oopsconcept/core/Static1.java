package oopsconcept.core;

public class Static1 {
	{
		System.out.println("FIB");
		
	}
static
{ 
	System.out.println("FSB");
	}
Static1(){
	System.out.println("Constructor");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Static1 s = new Static1();
System.out.println("Main");
Static1 s1= new Static1();
	}
	static{
		System.out.println("Second static block");
	}
	{
		System.out.println("Second instance block");
	}
}
