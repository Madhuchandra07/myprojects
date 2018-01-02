package regularexpressions.com;

import java.util.regex.Pattern;

public class DemoRegex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		/*System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "arun$2"));//false ($ is not matched)  
		
*/	
		
	/*System.out.println(Pattern.matches("[7-9]{1}[0-9]{9}","7019402770"));*/
	System.out.println(Pattern.matches("[a-zA-Z0-9_.,]*@[a-z]*.[a-z]{3}","Mad@sdsd.h,u_an@gmail.abc"));
	
	}

}
