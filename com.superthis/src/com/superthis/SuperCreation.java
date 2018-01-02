package com.superthis;

class Animal4{
	Animal4(){
		System.out.println("Animal4 is created");
	
		
	}
}

class Dogs extends Animal4 {
	Dogs() {
		
		System.out.println("dog is created");
		
	}
}

public class SuperCreation {

	public static void main(String[] args) {
		Animal4 d1 = new Animal4();

	}

}
