package regularexpressions.com;

import java.util.StringTokenizer;

public class TokeniserDemo {

	public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("Icgc software solutions pvt ltd");
		String[] a=new String[5];
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			a[0]=st.nextToken();
			
		}
		System.out.println(a[0]);
		}
		
	}

	

