package oopsconcept.core;

public class Initialization {
	private static String m1(String msg){
		System.out.println(msg);
		return msg;
		
	}
	public Initialization(){
		m=m1("1");
	}
	{
		m=m1("2");
		
	}
String m = m1("3");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object O = new Initialization();

	}

}