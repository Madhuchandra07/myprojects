package creativity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		int[] x={10,20,30,10,40,50,40};
		int size = x.length;
		System.out.println("The size of array before deletion :"+size);
		List l= Arrays.asList(x);
		TreeSet t = new TreeSet(l);
		System.out.println("After removing duplicates");
		System.out.println(t);
		

	}

}
