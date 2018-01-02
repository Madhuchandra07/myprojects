package com.superthis;

class A{
void m(){
	System.out.println("Hello Madhu");
}
void m1(){
	System.out.println("Welcome to super this keywords");

this.m();
}
}


public class Test {
	
	public static void main(String[] args){
		A a = new A();
		a.m1();
	}
	}

