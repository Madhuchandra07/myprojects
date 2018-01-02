package oopsBasics.core;

public class basicsOfJava {

	public void m1(int i)
	{
		System.out.println("Integer Method");
	
	}
	public void m1(float f){
		System.out.println("Float method");
		
	}

public static void main(String[] args){
basicsOfJava t = new basicsOfJava();
t.m1(5);
t.m1(22.5f);
System.out.println(t);

}
}