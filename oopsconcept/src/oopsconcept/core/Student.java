package oopsconcept.core;

public class Student {
	String name;
	int rollno;
	Student(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student("madhu", 102);
Student s2 = new Student("ani", 103);
Student s3= new Student("durga", 104);
System.out.println(s1.name);
System.out.println(s2.name);
System.out.println(s3.name);
	}

}
