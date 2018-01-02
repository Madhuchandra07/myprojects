package miscellaneous.core;

public class Madhu {
	static int count=0;
	{
		count++;
	}
	
	 static Madhu m = new Madhu();
	private Madhu(){
		
	}
	
	public static Madhu getM(){
		return m;
	}
	


	public static void main(String[] args) {
		Madhu m1= Madhu.getM();
		Madhu m2 = Madhu.getM();
		Madhu m3= Madhu.getM();
		
		
System.out.println(count);
	}

}


