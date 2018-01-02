package collections.core;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new Mycomparator());
		t.add("M");
		t.add("A");
		t.add("D");
		t.add("H");
		t.add("U");
		
		
		
		System.out.print(t);
		
	}

}
class Mycomparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		String i1=(String)o1;
		String i2=(String)o2;
		return +1;
		
		
	}
}
	
