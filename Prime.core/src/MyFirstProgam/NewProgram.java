package MyFirstProgam;

public class NewProgram {

	public static void main(String[] args) {
		int count=0;
		String s = "Madhuchandra";
		int conso = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
				{
					count++;
				}
				else{
					conso++;
				}
				

		}
		System.out.println("The number of vowels:="+count);
		System.out.println("The number of consonants:="+conso);
}
}