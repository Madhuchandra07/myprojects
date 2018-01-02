package MyFirstProgam;

import java.util.LinkedList;


public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add("Madhu");
	    l.add(null);
	    l.add(30);
	    l.add(null);
	    l.add(1,"ani");
	    l.remove(3);
	    l.set(3, "Chandra");
	    l.remove(4);
	    System.out.println(l);
		
	}

}
