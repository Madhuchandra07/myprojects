
public class Practice {
	public static void main(String[] args){
		byte b = (byte)130;
		double d = 0.02555d;
		System.out.println(d);
		B b1= new B();
		b1.m2();
		
		
	}
	
}
interface A {
	public abstract void m1();
	public abstract void m2();
}
class B implements A{
	public void m1(){
		System.out.println("Hi");
	}
public void m2(){
	System.out.println("Hello");
}
}
