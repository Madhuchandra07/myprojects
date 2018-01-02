package collections.com.basics;

import java.util.TreeMap;

public class Hashtable1 {
	public static void main(String[] args){
		TreeMap t =new TreeMap();
		t.put(100, "A");
		t.put(107, "b");
		t.put(80, "C");
		t.put(110, "D");
		t.put(200, "E");
		t.put(180, "F");
		System.out.println(t);
		System.out.println("The first key is:="+t.firstKey());
		System.out.println("The last key is:="+t.lastKey());
		System.out.println("The headmap is:="+t.headMap(110));
		System.out.println("The tailmap is:="+t.tailMap(110));
		System.out.println("The submap is:="+t.subMap(100, 180));
		System.out.println("The value of comparator:="+t.comparator());
		
	}

}


