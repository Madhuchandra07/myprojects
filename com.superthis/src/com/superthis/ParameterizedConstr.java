package com.superthis;

class B
{
	
B() {
	
	System.out.println("Hello world");
	
}

B(int x){
	this();
	
	System.out.println(x);
}
}



public class ParameterizedConstr {

	public static void main(String[] args) {
		B a= new B(200);
	}

}
