package varargparameters;

public class Var_Arg_Practice {

	public static void main(String[] args) {
		m1();
		m1(10,20,30,40);
		
		m1(10,20);

	}
public static void m1(int... x){
	System.out.println(" Var arg method");
	
}

}
