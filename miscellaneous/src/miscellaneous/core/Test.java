package miscellaneous.core;

public class Test {

    private static Test t= new Test();
    private Test(){
    	
    	
    }
    public static Test getTest() {
    	System.out.println("Hello");
		return t;
	}
    
    
 public static void main(String[] args){
	 Test t1 = Test.getTest();
	 Test t2= Test.getTest();
	 Test t3= Test.getTest();
	 Test t4 = Test.getTest();
	 Madhu m1 = Madhu.getM();
	 
	 
	
	
 }
}
