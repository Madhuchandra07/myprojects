package oopsconcept.core;


class A {
	public void m1(){
		System.out.println("This is parent method");
	}
}
class B extends A{
	public void m1(){
		System.out.println("This is child method");
	}
}



public class OverridingProgram {

	public static void main(String[] args) {
		A b = new B();
		b.m1();

	}

}
