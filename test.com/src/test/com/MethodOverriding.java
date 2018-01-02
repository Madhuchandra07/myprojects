package test.com;

public class MethodOverriding {
	public static void main(String[] args){
		
	}
	public void m1(){
		System.out.println("Parent Method");
	}



}

class Child1 extends MethodOverriding{
	public void m1(){
		System.out.println("Overriding method");
	}
	public static void main(String[] args){
		MethodOverriding m = new Child1();
		m.m1();
		
	}
}

		
		
		
			
		
	


