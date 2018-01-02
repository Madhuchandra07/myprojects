package palindromeprogram;

class Parent {
public void methodOne(int... i){
System.out.println("parent class");
}
}
class Child extends Parent {   //overloading but not overriding.
public void methodOne(int... i) {
System.out.println("child class");
}
}
class Test {
public static void main(String[] args) {
Parent p=new Parent();
p.methodOne(10);//parent class
Child c=new Child();
c.methodOne(10);//child class
Parent p1=new Child();
p1.methodOne(10);//parent class
}
}	
	
