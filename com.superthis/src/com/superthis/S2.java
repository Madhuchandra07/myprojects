package com.superthis;

public class S2 {
	void m(Object o){
		System.out.println("Hello Madhu");
	}
	void p(){
		m(this);
		System.out.println("Get lost");
		
	}
public static void main(String[] args){
	S2 s= new S2();
	s.p();
}
}
