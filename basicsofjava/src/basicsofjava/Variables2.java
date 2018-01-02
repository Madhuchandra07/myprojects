package basicsofjava;

public class Variables2 {

	public static void main(String[] args) {
		int x=0, flag=0;
		int y = 7;
		x = y/2;
		for(int i=2;i<=x;i++)
		{
			if(y%i==0){
				System.out.println("The Entered number is not a prime number");
				flag = 1;
				break;
			
			}
		}
	if (flag==0)
	
		System.out.println("Entered number is  a  prime number");}
	


}
