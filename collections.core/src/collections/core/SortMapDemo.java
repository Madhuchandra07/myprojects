package collections.core;

import java.util.*;


public class SortMapDemo {

	public static void main(String[] args) {
		
		TreeMap t = new TreeMap(new Mycomparator1());
		t.put(109, "AA");
		t.put(107,"BB");
		t.put(100, "CC");
		t.put(103, "FG");
		t.put(107, "Madhu");
		
		System.out.println(t);
		TreeMap t1=new TreeMap(t);
		System.out.println(t1);
	}
}
		
class Mycomparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1= (Integer)o1;
		Integer i2= (Integer)o2;
	
		return i2.compareTo(i1);
		}
	    
	}

