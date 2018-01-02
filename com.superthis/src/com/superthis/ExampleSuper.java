package com.superthis;

class Animal1{
	void eat(){
		System.out.println("Eating...");
	}
}
class Dog extends Animal1
{
	void eat(){
		
		System.out.println("Eating Bread");
		super.eat();
	}
void bark(){

	System.out.println("Barking");
}
void work(){
	super.eat();
	bark();
}
}

public class ExampleSuper {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.eat();

	}

}
